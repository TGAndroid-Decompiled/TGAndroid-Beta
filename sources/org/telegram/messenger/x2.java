package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class x2 implements u10 {
    public final y2 f27837a;
    public final Pair f27838b;
    public final Object f27839c;
    public final int d;
    public final Object f27840e;

    public x2(y2 y2Var, Pair pair, Object obj, int i7, Object obj2) {
        this.f27837a = y2Var;
        this.f27838b = pair;
        this.f27839c = obj;
        this.d = i7;
        this.f27840e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l10 = (Long) obj3;
        y2 y2Var = this.f27837a;
        y2Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.f27838b;
        if (booleanValue) {
            if (y2Var.d == null) {
                y2Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            y2Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (y2Var instanceof lo) {
                y2Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.f27839c;
            y2Var.a(pair, obj5);
            g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj5, true, 8));
            return;
        }
        if (obj2 != null) {
            l10.getClass();
            y2Var.g(this.d, this.f27840e, obj2);
            y2Var.a(pair, obj2);
        }
        g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj2, true, 8));
    }
}
