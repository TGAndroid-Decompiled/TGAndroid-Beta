package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
public abstract class x2 {
    public final long f26337a;
    public HashMap f26338b;
    public HashMap f26339c;
    public HashMap d;

    public x2() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        if (this.f26338b == null) {
            this.f26338b = new HashMap();
        }
        this.f26338b.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i3, Object obj, u10 u10Var) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i3), obj);
        HashMap hashMap = this.f26339c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.h3(new fg(this, pair, u10Var, 11));
            return;
        }
        HashMap hashMap2 = this.f26338b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            u10Var.a(obj2);
            return;
        }
        g0.h3(new fg(this, pair, u10Var, 11));
        e(i3, obj, new v2(this, pair, obj, i3));
    }

    public final void d(int i3, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i3), num);
            this.d.remove(pair);
            if (this instanceof fo) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i3, Object obj, n10 n10Var) {
        ((v2) n10Var).a(0L, null);
    }

    public abstract void f(int i3, Object obj, long j10, w2 w2Var);

    public final boolean i(Pair pair) {
        Long l10;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            l10 = (Long) hashMap.get(pair);
        } else {
            l10 = null;
        }
        if ((this instanceof fo) && l10 == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((fo) this).f22536e.f22999e7;
            l10 = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < this.f26337a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public x2(int i3) {
        this.f26337a = i3;
    }

    public void h(int i3, long j10) {
    }

    public void g(int i3, Object obj, Object obj2) {
    }
}
