package org.telegram.messenger;

import android.util.Pair;
public final class w2 implements r10 {
    public final y2 f27678a;
    public final Pair f27679b;
    public final Object f27680c;
    public final int d;

    public w2(y2 y2Var, Pair pair, Object obj, int i7) {
        this.f27678a = y2Var;
        this.f27679b = pair;
        this.f27680c = obj;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        y2 y2Var = this.f27678a;
        Pair pair = this.f27679b;
        if (y2Var.i(pair)) {
            Object obj4 = this.f27680c;
            if (obj2 != null && y2Var.b(obj4)) {
                y2Var.a(pair, obj2);
                obj3 = obj2;
                g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj3, false, 8));
            } else {
                obj3 = obj2;
            }
            long longValue = l10.longValue();
            int i7 = this.d;
            y2Var.f(i7, obj4, longValue, new x2(y2Var, pair, obj3, i7, obj4));
            return;
        }
        y2Var.a(pair, obj2);
        g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj2, true, 8));
    }
}
