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
    public static volatile f2[] f23821f = new f2[4];
    public final hi.u5 f23822a;
    public final hi.u5 f23823b;
    public final Set f23824c;
    public final LongSparseArray d;
    public final SharedPreferences f23825e;

    public f2(int i7) {
        super(i7);
        this.f23822a = new hi.u5();
        this.f23823b = new hi.u5();
        this.f23824c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        Context context = t0.f26913b;
        this.f23825e = context.getSharedPreferences("bot_drafts" + i7, 0);
    }

    public static f2 b(int i7) {
        f2 f2Var;
        f2 f2Var2 = f23821f[i7];
        if (f2Var2 == null) {
            synchronized (f2.class) {
                try {
                    f2Var = f23821f[i7];
                    if (f2Var == null) {
                        f2[] f2VarArr = f23821f;
                        f2 f2Var3 = new f2(i7);
                        f2VarArr[i7] = f2Var3;
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

    public final boolean c(int i7, long j3) {
        LongSparseArray p10 = this.f23822a.p(j3, i7);
        if (p10 != null && p10.size() > 0) {
            int size = p10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!((a2) p10.valueAt(i10)).f22812e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j3, long j10) {
        return this.f23825e.getBoolean(j3 + "_" + j10, false);
    }

    public final void e(long j3, int i7, long j10) {
        long j11 = i7;
        a2 a2Var = (a2) this.f23822a.y(j3, j11, j10);
        if (a2Var == null) {
            return;
        }
        getNotificationCenter().k(ks.O5, new b2(j3, a2Var.f22810b, j11));
    }

    public final void f(int i7, long j3) {
        LongSparseArray longSparseArray = this.d;
        List<nr> list = (List) longSparseArray.get(j3);
        if (list != null) {
            longSparseArray.remove(j3);
            for (nr nrVar : list) {
                nrVar.a(i7);
            }
        }
    }

    public final void g(int i7, long j3) {
        long j10;
        long j11;
        long j12 = i7;
        LongSparseArray p10 = this.f23822a.p(j3, j12);
        if (p10 != null) {
            int size = p10.size();
            int i10 = 0;
            while (i10 < size) {
                a2 a2Var = (a2) p10.valueAt(i10);
                if (a2Var.f22812e) {
                    long j13 = j12;
                    j10 = j3;
                    getNotificationCenter().k(ks.O5, new b2(j10, a2Var.f22810b, j13));
                    this.f23822a.y(j10, j13, a2Var.f22809a);
                    j11 = j13;
                    i10--;
                    size--;
                } else {
                    j10 = j3;
                    j11 = j12;
                }
                i10++;
                j3 = j10;
                j12 = j11;
            }
        }
    }

    public final void h(long j3, long j10, boolean z10) {
        SharedPreferences.Editor edit = this.f23825e.edit();
        edit.putBoolean(j3 + "_" + j10, z10).apply();
    }
}
