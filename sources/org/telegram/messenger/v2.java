package org.telegram.messenger;

import android.util.Pair;
public final class v2 implements s10 {
    public final x2 f26926a;
    public final Pair f26927b;
    public final Object f26928c;
    public final int d;

    public v2(x2 x2Var, Pair pair, Object obj, int i7) {
        this.f26926a = x2Var;
        this.f26927b = pair;
        this.f26928c = obj;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        x2 x2Var = this.f26926a;
        Pair pair = this.f26927b;
        if (x2Var.i(pair)) {
            Object obj4 = this.f26928c;
            if (obj2 != null && x2Var.b(obj4)) {
                x2Var.a(pair, obj2);
                obj3 = obj2;
                g0.h3(new aa.c0((Object) x2Var, (Object) pair, obj3, false, 8));
            } else {
                obj3 = obj2;
            }
            long longValue = l10.longValue();
            int i7 = this.d;
            x2Var.f(i7, obj4, longValue, new w2(x2Var, pair, obj3, i7, obj4));
            return;
        }
        x2Var.a(pair, obj2);
        g0.h3(new aa.c0((Object) x2Var, (Object) pair, obj2, true, 8));
    }
}
