package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
public final class j2 extends f1 {
    public static volatile j2[] f16211f = new j2[4];
    public final l2.f f16212a;
    public final l2.f f16213b;
    public final Set f16214c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public j2(int i10) {
        super(i10);
        this.f16212a = new l2.f(9);
        this.f16213b = new l2.f(9);
        this.f16214c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        Context context = w0.f19025b;
        this.e = context.getSharedPreferences("bot_drafts" + i10, 0);
    }

    public static j2 b(int i10) {
        j2 j2Var;
        j2 j2Var2 = f16211f[i10];
        if (j2Var2 == null) {
            synchronized (j2.class) {
                try {
                    j2Var = f16211f[i10];
                    if (j2Var == null) {
                        j2[] j2VarArr = f16211f;
                        j2 j2Var3 = new j2(i10);
                        j2VarArr[i10] = j2Var3;
                        j2Var = j2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return j2Var;
        }
        return j2Var2;
    }

    public final boolean a(final org.telegram.tgnet.TLObject r20, java.util.List r21, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.j2.a(org.telegram.tgnet.TLObject, java.util.List, java.lang.Runnable):boolean");
    }

    public final boolean c(int i10, long j10) {
        LongSparseArray s10 = this.f16212a.s(j10, i10);
        if (s10 != null && s10.size() > 0) {
            int size = s10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!((e2) s10.valueAt(i11)).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j10, long j11) {
        return this.e.getBoolean(j10 + "_" + j11, false);
    }

    public final void e(long j10, int i10, long j11) {
        long j12 = i10;
        e2 e2Var = (e2) this.f16212a.P(j10, j12, j11);
        if (e2Var == null) {
            return;
        }
        getNotificationCenter().k(zs.L5, new f2(j10, e2Var.f15355b, j12));
    }

    public final void f(int i10, long j10) {
        LongSparseArray longSparseArray = this.d;
        List<bs> list = (List) longSparseArray.get(j10);
        if (list != null) {
            longSparseArray.remove(j10);
            for (bs bsVar : list) {
                bsVar.a(i10);
            }
        }
    }

    public final void g(int i10, long j10) {
        long j11;
        long j12;
        long j13 = i10;
        LongSparseArray s10 = this.f16212a.s(j10, j13);
        if (s10 != null) {
            int size = s10.size();
            int i11 = 0;
            while (i11 < size) {
                e2 e2Var = (e2) s10.valueAt(i11);
                if (e2Var.e) {
                    long j14 = j13;
                    j11 = j10;
                    getNotificationCenter().k(zs.L5, new f2(j11, e2Var.f15355b, j14));
                    this.f16212a.P(j11, j14, e2Var.f15354a);
                    j12 = j14;
                    i11--;
                    size--;
                } else {
                    j11 = j10;
                    j12 = j13;
                }
                i11++;
                j10 = j11;
                j13 = j12;
            }
        }
    }

    public final void h(long j10, long j11, boolean z10) {
        SharedPreferences.Editor edit = this.e.edit();
        edit.putBoolean(j10 + "_" + j11, z10).apply();
    }
}
