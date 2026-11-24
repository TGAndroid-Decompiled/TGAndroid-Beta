package defpackage;

import android.util.Pair;
import java.util.HashMap;
public final class s61 implements m8c {
    public final t61 a;
    public final Pair b;
    public final Object c;
    public final int d;
    public final Object e;

    public s61(t61 t61Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = t61Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        t61 t61Var = this.a;
        t61Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (t61Var.d == null) {
                t61Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            t61Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (t61Var instanceof n97) {
                t61Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            t61Var.a(pair, obj5);
            gl.d3(new qg((Object) t61Var, (Object) pair, obj5, true, (byte) 2));
            return;
        }
        if (obj2 != null) {
            l.getClass();
            t61Var.g(this.d, this.e, obj2);
            t61Var.a(pair, obj2);
        }
        gl.d3(new qg((Object) t61Var, (Object) pair, obj2, true, (byte) 2));
    }
}
