package defpackage;

import android.util.Pair;
import java.util.HashMap;
public final class z71 implements nac {
    public final a81 a;
    public final Pair b;
    public final Object c;
    public final int d;
    public final Object e;

    public z71(a81 a81Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = a81Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        a81 a81Var = this.a;
        a81Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (a81Var.d == null) {
                a81Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            a81Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (a81Var instanceof ob7) {
                a81Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            a81Var.a(pair, obj5);
            gm.c3(new rh((Object) a81Var, (Object) pair, obj5, true, (byte) 2));
            return;
        }
        if (obj2 != null) {
            l.getClass();
            a81Var.g(this.d, this.e, obj2);
            a81Var.a(pair, obj2);
        }
        gm.c3(new rh((Object) a81Var, (Object) pair, obj2, true, (byte) 2));
    }
}
