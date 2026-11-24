package defpackage;

import java.util.List;
public final class y3b implements rac {
    public final z3b a;
    public final boolean b;
    public final int c;
    public final List d;

    public y3b(z3b z3bVar, boolean z, int i, List list) {
        this.a = z3bVar;
        this.b = z;
        this.c = i;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
