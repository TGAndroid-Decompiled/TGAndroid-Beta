package defpackage;

import android.util.Pair;
import java.util.HashMap;
public final class a71 implements mcc {
    public final b71 a;
    public final Pair b;
    public final Object c;
    public final int d;
    public final Object e;

    public a71(b71 b71Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = b71Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        b71 b71Var = this.a;
        b71Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (b71Var.d == null) {
                b71Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            b71Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (b71Var instanceof ub7) {
                b71Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            b71Var.a(pair, obj5);
            hl.c3(new lg((Object) b71Var, (Object) pair, obj5, true, (byte) 2));
            return;
        }
        if (obj2 != null) {
            l.getClass();
            b71Var.g(this.d, this.e, obj2);
            b71Var.a(pair, obj2);
        }
        hl.c3(new lg((Object) b71Var, (Object) pair, obj2, true, (byte) 2));
    }
}
