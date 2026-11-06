package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
public abstract class x2 {
    public final long f26426a;
    public HashMap f26427b;
    public HashMap f26428c;
    public HashMap d;

    public x2() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        if (this.f26427b == null) {
            this.f26427b = new HashMap();
        }
        this.f26427b.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i7, Object obj, c20 c20Var) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i7), obj);
        HashMap hashMap = this.f26428c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.h3(new ng(this, pair, c20Var, 11));
            return;
        }
        HashMap hashMap2 = this.f26427b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            c20Var.a(obj2);
            return;
        }
        g0.h3(new ng(this, pair, c20Var, 11));
        e(i7, obj, new v2(this, pair, obj, i7));
    }

    public final void d(int i7, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i7), num);
            this.d.remove(pair);
            if (this instanceof po) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i7, Object obj, v10 v10Var) {
        ((v2) v10Var).a(0L, null);
    }

    public abstract void f(int i7, Object obj, long j3, w2 w2Var);

    public final boolean i(Pair pair) {
        Long l10;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            l10 = (Long) hashMap.get(pair);
        } else {
            l10 = null;
        }
        if ((this instanceof po) && l10 == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((po) this).f24600e.f24767e7;
            l10 = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < this.f26426a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public x2(int i7) {
        this.f26426a = i7;
    }

    public void h(int i7, long j3) {
    }

    public void g(int i7, Object obj, Object obj2) {
    }
}
