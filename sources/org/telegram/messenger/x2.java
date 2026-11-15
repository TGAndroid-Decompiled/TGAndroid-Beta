package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
public abstract class x2 {
    public final long f27456a;
    public HashMap f27457b;
    public HashMap f27458c;
    public HashMap d;

    public x2() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        if (this.f27457b == null) {
            this.f27457b = new HashMap();
        }
        this.f27457b.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i7, Object obj, z10 z10Var) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i7), obj);
        HashMap hashMap = this.f27458c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.h3(new mg(this, pair, z10Var, 11));
            return;
        }
        HashMap hashMap2 = this.f27457b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            z10Var.a(obj2);
            return;
        }
        g0.h3(new mg(this, pair, z10Var, 11));
        e(i7, obj, new v2(this, pair, obj, i7));
    }

    public final void d(int i7, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i7), num);
            this.d.remove(pair);
            if (this instanceof mo) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i7, Object obj, s10 s10Var) {
        ((v2) s10Var).a(0L, null);
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
        if ((this instanceof mo) && l10 == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((mo) this).f25084e.f25283f7;
            l10 = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < this.f27456a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public x2(int i7) {
        this.f27456a = i7;
    }

    public void h(int i7, long j3) {
    }

    public void g(int i7, Object obj, Object obj2) {
    }
}
