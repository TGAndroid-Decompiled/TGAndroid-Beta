package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class u2 {
    public final int f25643a;
    public boolean f25644b = false;
    public final int[] f25645c = {-1, -1, -1, -1};

    public u2(int i3) {
        this.f25643a = i3;
    }

    public static long a(int i3) {
        if (i3 == 0) {
            return 604800L;
        }
        if (i3 == 1) {
            return 2592000L;
        }
        if (i3 == 3) {
            return 86400L;
        }
        if (i3 == 6) {
            return 172800L;
        }
        if (i3 == 5) {
            boolean z10 = r2.f25040a;
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 0;
        }
        if (i3 == 3) {
            return 6;
        }
        return az.G;
    }

    public static String f(int i3) {
        if (i3 == 5) {
            return bd.G(1, "Minutes", new Object[0]);
        }
        if (i3 == 3) {
            return bd.G(1, "Days", new Object[0]);
        }
        if (i3 == 6) {
            return bd.G(2, "Days", new Object[0]);
        }
        if (i3 == 0) {
            return bd.G(1, "Weeks", new Object[0]);
        }
        if (i3 == 1) {
            return bd.G(1, "Months", new Object[0]);
        }
        return bd.M0(2131753851, null);
    }

    public final int c(int i3) {
        boolean z10 = this.f25644b;
        int[] iArr = this.f25645c;
        if (!z10) {
            this.f25644b = true;
            for (int i10 = 0; i10 < 4; i10++) {
                iArr[i10] = az.q().getInt(k2.p1.i(i10, "keep_media_type_"), b(i10));
            }
        }
        int i11 = iArr[i3];
        if (i11 == -1) {
            return az.G;
        }
        return i11;
    }

    public final ArrayList d(int i3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences k10 = h10.i(this.f25643a).k();
        String string = k10.getString("keep_media_exceptions_" + i3, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i10 = wrap.getInt();
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = wrap.getLong();
            s2 s2Var = new s2(j10, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j10))) {
                hashSet.add(Long.valueOf(j10));
                arrayList.add(s2Var);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public final LongSparseArray e() {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i3 = 0; i3 < 3; i3++) {
            ArrayList d = d(i3);
            for (int i10 = 0; i10 < d.size(); i10++) {
                longSparseArray.put(((s2) d.get(i10)).f25268a, (s2) d.get(i10));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i3;
        int i10 = this.f25643a;
        f8 f8Var = w7.G(i10).d;
        f8Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        f8Var.h(new ul(f8Var, arrayList, longSparseArray, countDownLatch, 7));
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            a8.g(e10, true);
        }
        LongSparseArray e11 = e();
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            long keyAt = longSparseArray.keyAt(i11);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i11);
            if (keyAt >= 0) {
                i3 = 0;
            } else {
                long j10 = -keyAt;
                TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(j10));
                if (M0 == null) {
                    M0 = qr.a0(i10).P(j10);
                }
                if (M0 == null) {
                    i3 = -1;
                } else if (t3.T(M0)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
            }
            s2 s2Var = (s2) e11.get(keyAt);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                t2 t2Var = (t2) arrayList2.get(i12);
                if (i3 >= 0) {
                    t2Var.f25478c = i3;
                }
                if (s2Var != null) {
                    t2Var.f25477b = s2Var.f25269b;
                }
            }
        }
    }

    public final void h(int i3, ArrayList arrayList) {
        String i10 = k2.p1.i(i3, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i11 = this.f25643a;
        if (isEmpty) {
            h10.i(i11).k().edit().remove(i10).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            allocate.putLong(((s2) arrayList.get(i12)).f25268a);
            allocate.putInt(((s2) arrayList.get(i12)).f25269b);
        }
        h10.i(i11).k().edit().putString(i10, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
