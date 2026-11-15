package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class w2 implements w10 {
    public final x2 f27292a;
    public final Pair f27293b;
    public final Object f27294c;
    public final int d;
    public final Object f27295e;

    public w2(x2 x2Var, Pair pair, Object obj, int i7, Object obj2) {
        this.f27292a = x2Var;
        this.f27293b = pair;
        this.f27294c = obj;
        this.d = i7;
        this.f27295e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l10 = (Long) obj3;
        x2 x2Var = this.f27292a;
        x2Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.f27293b;
        if (booleanValue) {
            if (x2Var.d == null) {
                x2Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            x2Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (x2Var instanceof mo) {
                x2Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.f27294c;
            x2Var.a(pair, obj5);
            g0.h3(new aa.c0((Object) x2Var, (Object) pair, obj5, true, 8));
            return;
        }
        if (obj2 != null) {
            l10.getClass();
            x2Var.g(this.d, this.f27295e, obj2);
            x2Var.a(pair, obj2);
        }
        g0.h3(new aa.c0((Object) x2Var, (Object) pair, obj2, true, 8));
    }
}
