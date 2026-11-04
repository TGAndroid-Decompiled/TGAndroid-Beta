package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class w2 implements r10 {
    public final x2 f26152a;
    public final Pair f26153b;
    public final Object f26154c;
    public final int d;
    public final Object f26155e;

    public w2(x2 x2Var, Pair pair, Object obj, int i3, Object obj2) {
        this.f26152a = x2Var;
        this.f26153b = pair;
        this.f26154c = obj;
        this.d = i3;
        this.f26155e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l10 = (Long) obj3;
        x2 x2Var = this.f26152a;
        x2Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.f26153b;
        if (booleanValue) {
            if (x2Var.d == null) {
                x2Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            x2Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (x2Var instanceof fo) {
                x2Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.f26154c;
            x2Var.a(pair, obj5);
            g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj5, true, 8));
            return;
        }
        if (obj2 != null) {
            l10.getClass();
            x2Var.g(this.d, this.f26155e, obj2);
            x2Var.a(pair, obj2);
        }
        g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj2, true, 8));
    }
}
