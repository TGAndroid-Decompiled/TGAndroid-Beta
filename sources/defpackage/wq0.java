package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.a;
public final class wq0 extends pg0 {
    public static volatile wq0[] f = new wq0[4];
    public final nl9 a;
    public final nl9 b;
    public final Set c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public wq0(int i) {
        super(i);
        this.a = new nl9((byte) 10);
        this.b = new nl9((byte) 10);
        this.c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        Context context = a.b;
        this.e = context.getSharedPreferences("bot_drafts" + i, 0);
    }

    public static wq0 b(int i) {
        wq0 wq0Var;
        wq0 wq0Var2 = f[i];
        if (wq0Var2 == null) {
            synchronized (wq0.class) {
                wq0Var = f[i];
                if (wq0Var == null) {
                    wq0[] wq0VarArr = f;
                    wq0 wq0Var3 = new wq0(i);
                    wq0VarArr[i] = wq0Var3;
                    wq0Var = wq0Var3;
                }
            }
            return wq0Var;
        }
        return wq0Var2;
    }

    public final boolean a(final org.telegram.tgnet.TLObject r21, java.util.List r22, final java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq0.a(org.telegram.tgnet.TLObject, java.util.List, java.lang.Runnable):boolean");
    }

    public final boolean c(int i, long j) {
        LongSparseArray z0 = this.a.z0(j, i);
        if (z0 != null && z0.size() > 0) {
            int size = z0.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!((rq0) z0.valueAt(i2)).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j, long j2) {
        return this.e.getBoolean(j + "_" + j2, false);
    }

    public final void e(long j, int i, long j2) {
        long j3 = i;
        rq0 rq0Var = (rq0) this.a.J0(j, j3, j2);
        if (rq0Var == null) {
            return;
        }
        getNotificationCenter().k(nm7.P5, new sq0(j, rq0Var.b, j3));
    }

    public final void f(int i, long j) {
        LongSparseArray longSparseArray = this.d;
        List<we7> list = (List) longSparseArray.get(j);
        if (list != null) {
            longSparseArray.remove(j);
            for (we7 we7Var : list) {
                we7Var.a(i);
            }
        }
    }

    public final void g(int i, long j) {
        long j2;
        nl9 nl9Var;
        long j3 = i;
        nl9 nl9Var2 = this.a;
        long j4 = j;
        LongSparseArray z0 = nl9Var2.z0(j4, j3);
        if (z0 != null) {
            int size = z0.size();
            int i2 = 0;
            while (i2 < size) {
                rq0 rq0Var = (rq0) z0.valueAt(i2);
                if (rq0Var.e) {
                    long j5 = j3;
                    getNotificationCenter().k(nm7.P5, new sq0(j4, rq0Var.b, j5));
                    nl9Var = nl9Var2;
                    nl9Var.J0(j, j5, rq0Var.a);
                    j2 = j5;
                    i2--;
                    size--;
                } else {
                    j2 = j3;
                    nl9Var = nl9Var2;
                }
                i2++;
                j4 = j;
                nl9Var2 = nl9Var;
                j3 = j2;
            }
        }
    }

    public final void h(long j, long j2, boolean z) {
        SharedPreferences.Editor edit = this.e.edit();
        edit.putBoolean(j + "_" + j2, z).apply();
    }
}
