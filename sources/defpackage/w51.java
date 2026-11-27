package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w51 {
    public final int a;
    public boolean b = false;
    public final int[] c = {-1, -1, -1, -1};

    public w51(int i) {
        this.a = i;
    }

    public static long a(int i) {
        if (i == 0) {
            return 604800L;
        }
        if (i == 1) {
            return 2592000L;
        }
        if (i == 3) {
            return 86400L;
        }
        if (i == 6) {
            return 172800L;
        }
        if (i == 5) {
            boolean z = f11.a;
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 6;
        }
        return xea.F;
    }

    public static String f(int i) {
        if (i == 5) {
            return ob6.G(1, "Minutes", new Object[0]);
        }
        if (i == 3) {
            return ob6.G(1, "Days", new Object[0]);
        }
        if (i == 6) {
            return ob6.G(2, "Days", new Object[0]);
        }
        if (i == 0) {
            return ob6.G(1, "Weeks", new Object[0]);
        }
        if (i == 1) {
            return ob6.G(1, "Months", new Object[0]);
        }
        return ob6.M0(2131753844, null);
    }

    public final int c(int i) {
        boolean z = this.b;
        int[] iArr = this.c;
        if (!z) {
            this.b = true;
            for (int i2 = 0; i2 < 4; i2++) {
                iArr[i2] = xea.q().getInt(uh9.k(i2, "keep_media_type_"), b(i2));
            }
        }
        int i3 = iArr[i];
        if (i3 == -1) {
            return xea.F;
        }
        return i3;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences j = yac.h(this.a).j();
        String string = j.getString("keep_media_exceptions_" + i, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i2 = wrap.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = wrap.getLong();
            u51 u51Var = new u51(j2, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j2))) {
                hashSet.add(Long.valueOf(j2));
                arrayList.add(u51Var);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public final LongSparseArray e() {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i = 0; i < 3; i++) {
            ArrayList d = d(i);
            for (int i2 = 0; i2 < d.size(); i2++) {
                longSparseArray.put(((u51) d.get(i2)).a, (u51) d.get(i2));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i;
        int i2 = this.a;
        ic4 ic4Var = xb4.G(i2).d;
        ic4Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        ic4Var.h(new ao1(ic4Var, arrayList, longSparseArray, countDownLatch, (byte) 18));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            cc4.g(e, true);
        }
        LongSparseArray e2 = e();
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i3);
            if (keyAt >= 0) {
                i = 0;
            } else {
                long j = -keyAt;
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(j));
                if (M0 == null) {
                    M0 = jf7.Y(i2).O(j);
                }
                if (M0 == null) {
                    i = -1;
                } else if (xc2.T(M0)) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            u51 u51Var = (u51) e2.get(keyAt);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                v51 v51Var = (v51) arrayList2.get(i4);
                if (i >= 0) {
                    v51Var.c = i;
                }
                if (u51Var != null) {
                    v51Var.b = u51Var.b;
                }
            }
        }
    }

    public final void h(int i, ArrayList arrayList) {
        String k = uh9.k(i, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i2 = this.a;
        if (isEmpty) {
            yac.h(i2).j().edit().remove(k).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            allocate.putLong(((u51) arrayList.get(i3)).a);
            allocate.putInt(((u51) arrayList.get(i3)).b);
        }
        yac.h(i2).j().edit().putString(k, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
