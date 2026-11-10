package org.telegram.messenger;

import android.util.Pair;
public final class v2 implements v10 {
    public final x2 f25941a;
    public final Pair f25942b;
    public final Object f25943c;
    public final int d;

    public v2(x2 x2Var, Pair pair, Object obj, int i7) {
        this.f25941a = x2Var;
        this.f25942b = pair;
        this.f25943c = obj;
        this.d = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        x2 x2Var = this.f25941a;
        Pair pair = this.f25942b;
        if (x2Var.i(pair)) {
            Object obj4 = this.f25943c;
            if (obj2 != null && x2Var.b(obj4)) {
                x2Var.a(pair, obj2);
                obj3 = obj2;
                g0.h3(new aa.d0((Object) x2Var, (Object) pair, obj3, false, 8));
            } else {
                obj3 = obj2;
            }
            long longValue = l10.longValue();
            int i7 = this.d;
            x2Var.f(i7, obj4, longValue, new w2(x2Var, pair, obj3, i7, obj4));
            return;
        }
        x2Var.a(pair, obj2);
        g0.h3(new aa.d0((Object) x2Var, (Object) pair, obj2, true, 8));
    }
}
