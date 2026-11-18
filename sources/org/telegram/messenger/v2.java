package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class v2 {
    public final int f27319a;
    public boolean f27320b = false;
    public final int[] f27321c = {-1, -1, -1, -1};

    public v2(int i7) {
        this.f27319a = i7;
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
            boolean z10 = s2.f26723a;
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
        return bz.G;
    }

    public static String f(int i7) {
        if (i7 == 5) {
            return gd.G(1, "Minutes", new Object[0]);
        }
        if (i7 == 3) {
            return gd.G(1, "Days", new Object[0]);
        }
        if (i7 == 6) {
            return gd.G(2, "Days", new Object[0]);
        }
        if (i7 == 0) {
            return gd.G(1, "Weeks", new Object[0]);
        }
        if (i7 == 1) {
            return gd.G(1, "Months", new Object[0]);
        }
        return gd.M0(2131753849, null);
    }

    public final int c(int i7) {
        boolean z10 = this.f27320b;
        int[] iArr = this.f27321c;
        if (!z10) {
            this.f27320b = true;
            for (int i10 = 0; i10 < 4; i10++) {
                iArr[i10] = bz.q().getInt(i5.c.i(i10, "keep_media_type_"), b(i10));
            }
        }
        int i11 = iArr[i7];
        if (i11 == -1) {
            return bz.G;
        }
        return i11;
    }

    public final ArrayList d(int i7) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences k10 = j10.i(this.f27319a).k();
        String string = k10.getString("keep_media_exceptions_" + i7, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i10 = wrap.getInt();
        for (int i11 = 0; i11 < i10; i11++) {
            long j3 = wrap.getLong();
            t2 t2Var = new t2(j3, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j3))) {
                hashSet.add(Long.valueOf(j3));
                arrayList.add(t2Var);
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
                longSparseArray.put(((t2) d.get(i10)).f26934a, (t2) d.get(i10));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i7;
        int i10 = this.f27319a;
        f8 f8Var = w7.G(i10).d;
        f8Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        f8Var.h(new tl(f8Var, arrayList, longSparseArray, countDownLatch, 7));
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
                TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(j3));
                if (O0 == null) {
                    O0 = tr.a0(i10).P(j3);
                }
                if (O0 == null) {
                    i7 = -1;
                } else if (v3.T(O0)) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
            }
            t2 t2Var = (t2) e11.get(keyAt);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                u2 u2Var = (u2) arrayList2.get(i12);
                if (i7 >= 0) {
                    u2Var.f27118c = i7;
                }
                if (t2Var != null) {
                    u2Var.f27117b = t2Var.f26935b;
                }
            }
        }
    }

    public final void h(int i7, ArrayList arrayList) {
        String i10 = i5.c.i(i7, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i11 = this.f27319a;
        if (isEmpty) {
            j10.i(i11).k().edit().remove(i10).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            allocate.putLong(((t2) arrayList.get(i12)).f26934a);
            allocate.putInt(((t2) arrayList.get(i12)).f26935b);
        }
        j10.i(i11).k().edit().putString(i10, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
