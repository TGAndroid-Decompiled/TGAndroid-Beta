package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
public abstract class y2 {
    public final long f27970a;
    public HashMap f27971b;
    public HashMap f27972c;
    public HashMap d;

    public y2() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        if (this.f27971b == null) {
            this.f27971b = new HashMap();
        }
        this.f27971b.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i7, Object obj, y10 y10Var) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i7), obj);
        HashMap hashMap = this.f27972c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.g3(new zf(this, pair, y10Var, 11));
            return;
        }
        HashMap hashMap2 = this.f27971b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            y10Var.a(obj2);
            return;
        }
        g0.g3(new zf(this, pair, y10Var, 11));
        e(i7, obj, new w2(this, pair, obj, i7));
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

    public void e(int i7, Object obj, r10 r10Var) {
        ((w2) r10Var).a(0L, null);
    }

    public abstract void f(int i7, Object obj, long j3, x2 x2Var);

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
            SharedPreferences sharedPreferences = ((mo) this).f25584e.h7;
            l10 = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l10 != null && System.currentTimeMillis() - l10.longValue() < this.f27970a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public y2(int i7) {
        this.f27970a = i7;
    }

    public void h(int i7, long j3) {
    }

    public void g(int i7, Object obj, Object obj2) {
    }
}
