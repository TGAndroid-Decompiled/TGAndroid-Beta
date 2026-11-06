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
    public final int f25711a;
    public boolean f25712b = false;
    public final int[] f25713c = {-1, -1, -1, -1};

    public u2(int i7) {
        this.f25711a = i7;
    }

    public static long a(int i7) {
        if (i7 == 0) {
            return 604800L;
        }
        if (i7 == 1) {
            return 2592000L;
        }
        if (i7 == 3) {
            return 86400L;
        }
        if (i7 == 6) {
            return 172800L;
        }
        if (i7 == 5) {
            boolean z9 = r2.f25191a;
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 0;
        }
        if (i7 == 3) {
            return 6;
        }
        return iz.G;
    }

    public static String f(int i7) {
        if (i7 == 5) {
            return hd.G(1, "Minutes", new Object[0]);
        }
        if (i7 == 3) {
            return hd.G(1, "Days", new Object[0]);
        }
        if (i7 == 6) {
            return hd.G(2, "Days", new Object[0]);
        }
        if (i7 == 0) {
            return hd.G(1, "Weeks", new Object[0]);
        }
        if (i7 == 1) {
            return hd.G(1, "Months", new Object[0]);
        }
        return hd.M0(2131753851, null);
    }

    public final int c(int i7) {
        boolean z9 = this.f25712b;
        int[] iArr = this.f25713c;
        if (!z9) {
            this.f25712b = true;
            for (int i10 = 0; i10 < 4; i10++) {
                iArr[i10] = iz.q().getInt(jg.g.j(i10, "keep_media_type_"), b(i10));
            }
        }
        int i11 = iArr[i7];
        if (i11 == -1) {
            return iz.G;
        }
        return i11;
    }

    public final ArrayList d(int i7) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences k10 = p10.i(this.f25711a).k();
        String string = k10.getString("keep_media_exceptions_" + i7, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i10 = wrap.getInt();
        for (int i11 = 0; i11 < i10; i11++) {
            long j3 = wrap.getLong();
            s2 s2Var = new s2(j3, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j3))) {
                hashSet.add(Long.valueOf(j3));
                arrayList.add(s2Var);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public final LongSparseArray e() {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i7 = 0; i7 < 3; i7++) {
            ArrayList d = d(i7);
            for (int i10 = 0; i10 < d.size(); i10++) {
                longSparseArray.put(((s2) d.get(i10)).f25403a, (s2) d.get(i10));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i7;
        int i10 = this.f25711a;
        f8 f8Var = w7.G(i10).d;
        f8Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        f8Var.h(new em(f8Var, arrayList, longSparseArray, countDownLatch, 7));
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
                i7 = 0;
            } else {
                long j3 = -keyAt;
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(j3));
                if (M0 == null) {
                    M0 = yr.a0(i10).P(j3);
                }
                if (M0 == null) {
                    i7 = -1;
                } else if (t3.T(M0)) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
            }
            s2 s2Var = (s2) e11.get(keyAt);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                t2 t2Var = (t2) arrayList2.get(i12);
                if (i7 >= 0) {
                    t2Var.f25573c = i7;
                }
                if (s2Var != null) {
                    t2Var.f25572b = s2Var.f25404b;
                }
            }
        }
    }

    public final void h(int i7, ArrayList arrayList) {
        String j3 = jg.g.j(i7, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i10 = this.f25711a;
        if (isEmpty) {
            p10.i(i10).k().edit().remove(j3).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            allocate.putLong(((s2) arrayList.get(i11)).f25403a);
            allocate.putInt(((s2) arrayList.get(i11)).f25404b);
        }
        p10.i(i10).k().edit().putString(j3, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
