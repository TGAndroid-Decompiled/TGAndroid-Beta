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
public final class o51 {
    public final int a;
    public boolean b = false;
    public final int[] c = {-1, -1, -1, -1};

    public o51(int i) {
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
            boolean z = w01.a;
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
        return gba.F;
    }

    public static String f(int i) {
        if (i == 5) {
            return k96.G(1, "Minutes", new Object[0]);
        }
        if (i == 3) {
            return k96.G(1, "Days", new Object[0]);
        }
        if (i == 6) {
            return k96.G(2, "Days", new Object[0]);
        }
        if (i == 0) {
            return k96.G(1, "Weeks", new Object[0]);
        }
        if (i == 1) {
            return k96.G(1, "Months", new Object[0]);
        }
        return k96.M0(2131753848, null);
    }

    public final int c(int i) {
        boolean z = this.b;
        int[] iArr = this.c;
        if (!z) {
            this.b = true;
            for (int i2 = 0; i2 < 4; i2++) {
                iArr[i2] = gba.q().getInt(de9.k(i2, "keep_media_type_"), b(i2));
            }
        }
        int i3 = iArr[i];
        if (i3 == -1) {
            return gba.F;
        }
        return i3;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences j = y6c.h(this.a).j();
        String string = j.getString("keep_media_exceptions_" + i, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i2 = wrap.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = wrap.getLong();
            m51 m51Var = new m51(j2, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j2))) {
                hashSet.add(Long.valueOf(j2));
                arrayList.add(m51Var);
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
                longSparseArray.put(((m51) d.get(i2)).a, (m51) d.get(i2));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i;
        int i2 = this.a;
        la4 la4Var = ba4.G(i2).d;
        la4Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        la4Var.h(new hn1(la4Var, arrayList, longSparseArray, countDownLatch, (byte) 18));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            fa4.g(e, true);
        }
        LongSparseArray e2 = e();
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i3);
            if (keyAt >= 0) {
                i = 0;
            } else {
                long j = -keyAt;
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(j));
                if (K0 == null) {
                    K0 = ad7.Y(i2).O(j);
                }
                if (K0 == null) {
                    i = -1;
                } else if (hc2.T(K0)) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            m51 m51Var = (m51) e2.get(keyAt);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                n51 n51Var = (n51) arrayList2.get(i4);
                if (i >= 0) {
                    n51Var.c = i;
                }
                if (m51Var != null) {
                    n51Var.b = m51Var.b;
                }
            }
        }
    }

    public final void h(int i, ArrayList arrayList) {
        String k = de9.k(i, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i2 = this.a;
        if (isEmpty) {
            y6c.h(i2).j().edit().remove(k).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            allocate.putLong(((m51) arrayList.get(i3)).a);
            allocate.putInt(((m51) arrayList.get(i3)).b);
        }
        y6c.h(i2).j().edit().putString(k, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
