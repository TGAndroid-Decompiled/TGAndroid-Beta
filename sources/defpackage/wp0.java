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
public final class wp0 extends rf0 {
    public static volatile wp0[] f = new wp0[4];
    public final zm9 a;
    public final zm9 b;
    public final Set c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public wp0(int i) {
        super(i);
        this.a = new zm9((byte) 10);
        this.b = new zm9((byte) 10);
        this.c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        Context context = a.b;
        this.e = context.getSharedPreferences("bot_drafts" + i, 0);
    }

    public static wp0 b(int i) {
        wp0 wp0Var;
        wp0 wp0Var2 = f[i];
        if (wp0Var2 == null) {
            synchronized (wp0.class) {
                wp0Var = f[i];
                if (wp0Var == null) {
                    wp0[] wp0VarArr = f;
                    wp0 wp0Var3 = new wp0(i);
                    wp0VarArr[i] = wp0Var3;
                    wp0Var = wp0Var3;
                }
            }
            return wp0Var;
        }
        return wp0Var2;
    }

    public final boolean a(final org.telegram.tgnet.TLObject r21, java.util.List r22, final java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp0.a(org.telegram.tgnet.TLObject, java.util.List, java.lang.Runnable):boolean");
    }

    public final boolean c(int i, long j) {
        LongSparseArray H0 = this.a.H0(j, i);
        if (H0 != null && H0.size() > 0) {
            int size = H0.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!((rp0) H0.valueAt(i2)).e) {
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
        rp0 rp0Var = (rp0) this.a.O0(j, j3, j2);
        if (rp0Var == null) {
            return;
        }
        getNotificationCenter().k(jn7.O5, new sp0(j, rp0Var.b, j3));
    }

    public final void f(int i, long j) {
        LongSparseArray longSparseArray = this.d;
        List<df7> list = (List) longSparseArray.get(j);
        if (list != null) {
            longSparseArray.remove(j);
            for (df7 df7Var : list) {
                df7Var.a(i);
            }
        }
    }

    public final void g(int i, long j) {
        long j2;
        zm9 zm9Var;
        long j3 = i;
        zm9 zm9Var2 = this.a;
        long j4 = j;
        LongSparseArray H0 = zm9Var2.H0(j4, j3);
        if (H0 != null) {
            int size = H0.size();
            int i2 = 0;
            while (i2 < size) {
                rp0 rp0Var = (rp0) H0.valueAt(i2);
                if (rp0Var.e) {
                    long j5 = j3;
                    getNotificationCenter().k(jn7.O5, new sp0(j4, rp0Var.b, j5));
                    zm9Var = zm9Var2;
                    zm9Var.O0(j, j5, rp0Var.a);
                    j2 = j5;
                    i2--;
                    size--;
                } else {
                    j2 = j3;
                    zm9Var = zm9Var2;
                }
                i2++;
                j4 = j;
                zm9Var2 = zm9Var;
                j3 = j2;
            }
        }
    }

    public final void h(long j, long j2, boolean z) {
        SharedPreferences.Editor edit = this.e.edit();
        edit.putBoolean(j + "_" + j2, z).apply();
    }
}
