package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
public abstract class b3 {
    public final long f14711a;
    public HashMap f14712b;
    public HashMap f14713c;
    public HashMap d;

    public b3() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (!j(pair.second)) {
            return;
        }
        if (this.f14712b == null) {
            this.f14712b = new HashMap();
        }
        this.f14712b.put(pair, obj);
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i10, Object obj, q20 q20Var) {
        Object obj2;
        Pair pair = new Pair(Integer.valueOf(i10), obj);
        HashMap hashMap = this.f14713c;
        if (hashMap != null && hashMap.get(pair) != null) {
            i0.g3(new mg(this, pair, q20Var, 11));
            return;
        }
        HashMap hashMap2 = this.f14712b;
        if (hashMap2 == null) {
            obj2 = null;
        } else {
            obj2 = hashMap2.get(pair);
        }
        if (obj2 != null && !i(pair)) {
            q20Var.a(obj2);
            return;
        }
        i0.g3(new mg(this, pair, q20Var, 11));
        e(i10, obj, new z2(this, pair, obj, i10));
    }

    public final void d(int i10, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i10), num);
            this.d.remove(pair);
            if (this instanceof uo) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i10, Object obj, j20 j20Var) {
        ((z2) j20Var).a(0L, null);
    }

    public abstract void f(int i10, Object obj, long j10, a3 a3Var);

    public final boolean i(Pair pair) {
        Long l4;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            l4 = (Long) hashMap.get(pair);
        } else {
            l4 = null;
        }
        if ((this instanceof uo) && l4 == null) {
            int hashCode = pair.hashCode();
            SharedPreferences sharedPreferences = ((uo) this).e.f7;
            l4 = Long.valueOf(sharedPreferences.getLong("effects_last_" + hashCode, 0L));
        }
        if (l4 != null && System.currentTimeMillis() - l4.longValue() < this.f14711a) {
            return false;
        }
        return true;
    }

    public boolean j(Object obj) {
        return true;
    }

    public b3(int i10) {
        this.f14711a = i10;
    }

    public void h(int i10, long j10) {
    }

    public void g(int i10, Object obj, Object obj2) {
    }
}
