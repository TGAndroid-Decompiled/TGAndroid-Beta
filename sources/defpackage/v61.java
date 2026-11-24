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
public final class v61 {
    public final int a;
    public boolean b = false;
    public final int[] c = {-1, -1, -1, -1};

    public v61(int i) {
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
            boolean z = e21.a;
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
        return gda.F;
    }

    public static String f(int i) {
        if (i == 5) {
            return jb6.G(1, "Minutes", new Object[0]);
        }
        if (i == 3) {
            return jb6.G(1, "Days", new Object[0]);
        }
        if (i == 6) {
            return jb6.G(2, "Days", new Object[0]);
        }
        if (i == 0) {
            return jb6.G(1, "Weeks", new Object[0]);
        }
        if (i == 1) {
            return jb6.G(1, "Months", new Object[0]);
        }
        return jb6.M0(2131753816, null);
    }

    public final int c(int i) {
        boolean z = this.b;
        int[] iArr = this.c;
        if (!z) {
            this.b = true;
            for (int i2 = 0; i2 < 4; i2++) {
                iArr[i2] = gda.q().getInt(hg9.j(i2, "keep_media_type_"), b(i2));
            }
        }
        int i3 = iArr[i];
        if (i3 == -1) {
            return gda.F;
        }
        return i3;
    }

    public final ArrayList d(int i) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        SharedPreferences j = z8c.h(this.a).j();
        String string = j.getString("keep_media_exceptions_" + i, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.v(string));
        int i2 = wrap.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = wrap.getLong();
            t61 t61Var = new t61(j2, wrap.getInt());
            if (!hashSet.contains(Long.valueOf(j2))) {
                hashSet.add(Long.valueOf(j2));
                arrayList.add(t61Var);
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
                longSparseArray.put(((t61) d.get(i2)).a, (t61) d.get(i2));
            }
        }
        return longSparseArray;
    }

    public final void g(ArrayList arrayList) {
        int i;
        int i2 = this.a;
        lc4 lc4Var = bc4.G(i2).d;
        lc4Var.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LongSparseArray longSparseArray = new LongSparseArray();
        lc4Var.h(new xo1(lc4Var, arrayList, longSparseArray, countDownLatch, (byte) 18));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            fc4.g(e, true);
        }
        LongSparseArray e2 = e();
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i3);
            if (keyAt >= 0) {
                i = 0;
            } else {
                long j = -keyAt;
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(j));
                if (L0 == null) {
                    L0 = cf7.Y(i2).O(j);
                }
                if (L0 == null) {
                    i = -1;
                } else if (sd2.T(L0)) {
                    i = 2;
                } else {
                    i = 1;
                }
            }
            t61 t61Var = (t61) e2.get(keyAt);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                u61 u61Var = (u61) arrayList2.get(i4);
                if (i >= 0) {
                    u61Var.c = i;
                }
                if (t61Var != null) {
                    u61Var.b = t61Var.b;
                }
            }
        }
    }

    public final void h(int i, ArrayList arrayList) {
        String j = hg9.j(i, "keep_media_exceptions_");
        boolean isEmpty = arrayList.isEmpty();
        int i2 = this.a;
        if (isEmpty) {
            z8c.h(i2).j().edit().remove(j).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            allocate.putLong(((t61) arrayList.get(i3)).a);
            allocate.putInt(((t61) arrayList.get(i3)).b);
        }
        z8c.h(i2).j().edit().putString(j, Utilities.f(allocate.array())).apply();
        allocate.clear();
    }
}
