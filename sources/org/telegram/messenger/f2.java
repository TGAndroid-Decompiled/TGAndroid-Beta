package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
public final class f2 extends c1 {
    public static volatile f2[] f22436f = new f2[4];
    public final gi.w5 f22437a;
    public final gi.w5 f22438b;
    public final Set f22439c;
    public final LongSparseArray d;
    public final SharedPreferences f22440e;

    public f2(int i3) {
        super(i3);
        this.f22437a = new gi.w5(23);
        this.f22438b = new gi.w5(23);
        this.f22439c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        Context context = t0.f25457b;
        this.f22440e = context.getSharedPreferences("bot_drafts" + i3, 0);
    }

    public static f2 b(int i3) {
        f2 f2Var;
        f2 f2Var2 = f22436f[i3];
        if (f2Var2 == null) {
            synchronized (f2.class) {
                try {
                    f2Var = f22436f[i3];
                    if (f2Var == null) {
                        f2[] f2VarArr = f22436f;
                        f2 f2Var3 = new f2(i3);
                        f2VarArr[i3] = f2Var3;
                        f2Var = f2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return f2Var;
        }
        return f2Var2;
    }

    public final boolean a(final org.telegram.tgnet.TLObject r20, java.util.List r21, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f2.a(org.telegram.tgnet.TLObject, java.util.List, java.lang.Runnable):boolean");
    }

    public final boolean c(int i3, long j10) {
        LongSparseArray U = this.f22437a.U(j10, i3);
        if (U != null && U.size() > 0) {
            int size = U.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!((a2) U.valueAt(i10)).f21430e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j10, long j11) {
        return this.f22440e.getBoolean(j10 + "_" + j11, false);
    }

    public final void e(long j10, int i3, long j11) {
        long j12 = i3;
        a2 a2Var = (a2) this.f22437a.b0(j10, j12, j11);
        if (a2Var == null) {
            return;
        }
        getNotificationCenter().k(hs.L5, new b2(j10, a2Var.f21428b, j12));
    }

    public final void f(int i3, long j10) {
        LongSparseArray longSparseArray = this.d;
        List<kr> list = (List) longSparseArray.get(j10);
        if (list != null) {
            longSparseArray.remove(j10);
            for (kr krVar : list) {
                krVar.a(i3);
            }
        }
    }

    public final void g(int i3, long j10) {
        long j11;
        long j12;
        long j13 = i3;
        LongSparseArray U = this.f22437a.U(j10, j13);
        if (U != null) {
            int size = U.size();
            int i10 = 0;
            while (i10 < size) {
                a2 a2Var = (a2) U.valueAt(i10);
                if (a2Var.f21430e) {
                    long j14 = j13;
                    j11 = j10;
                    getNotificationCenter().k(hs.L5, new b2(j11, a2Var.f21428b, j14));
                    this.f22437a.b0(j11, j14, a2Var.f21427a);
                    j12 = j14;
                    i10--;
                    size--;
                } else {
                    j11 = j10;
                    j12 = j13;
                }
                i10++;
                j10 = j11;
                j13 = j12;
            }
        }
    }

    public final void h(long j10, long j11, boolean z10) {
        SharedPreferences.Editor edit = this.f22440e.edit();
        edit.putBoolean(j10 + "_" + j11, z10).apply();
    }
}
