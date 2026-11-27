package defpackage;

import java.util.List;
public final class u5b implements qcc {
    public final v5b a;
    public final boolean b;
    public final int c;
    public final List d;

    public u5b(v5b v5bVar, boolean z, int i, List list) {
        this.a = v5bVar;
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
