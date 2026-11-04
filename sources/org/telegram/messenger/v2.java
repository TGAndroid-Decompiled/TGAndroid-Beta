package org.telegram.messenger;

import android.util.Pair;
public final class v2 implements n10 {
    public final x2 f25818a;
    public final Pair f25819b;
    public final Object f25820c;
    public final int d;

    public v2(x2 x2Var, Pair pair, Object obj, int i3) {
        this.f25818a = x2Var;
        this.f25819b = pair;
        this.f25820c = obj;
        this.d = i3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        x2 x2Var = this.f25818a;
        Pair pair = this.f25819b;
        if (x2Var.i(pair)) {
            Object obj4 = this.f25820c;
            if (obj2 != null && x2Var.b(obj4)) {
                x2Var.a(pair, obj2);
                obj3 = obj2;
                g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj3, false, 8));
            } else {
                obj3 = obj2;
            }
            long longValue = l10.longValue();
            int i3 = this.d;
            x2Var.f(i3, obj4, longValue, new w2(x2Var, pair, obj3, i3, obj4));
            return;
        }
        x2Var.a(pair, obj2);
        g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj2, true, 8));
    }
}
