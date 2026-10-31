package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;
public final class a3 implements n20 {
    public final b3 f14565a;
    public final Pair f14566b;
    public final Object f14567c;
    public final int d;
    public final Object e;

    public a3(b3 b3Var, Pair pair, Object obj, int i10, Object obj2) {
        this.f14565a = b3Var;
        this.f14566b = pair;
        this.f14567c = obj;
        this.d = i10;
        this.e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l4 = (Long) obj3;
        b3 b3Var = this.f14565a;
        b3Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.f14566b;
        if (booleanValue) {
            if (b3Var.d == null) {
                b3Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            b3Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (b3Var instanceof uo) {
                b3Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.f14567c;
            b3Var.a(pair, obj5);
            i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj5, true, 6));
            return;
        }
        if (obj2 != null) {
            l4.getClass();
            b3Var.g(this.d, this.e, obj2);
            b3Var.a(pair, obj2);
        }
        i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj2, true, 6));
    }
}
