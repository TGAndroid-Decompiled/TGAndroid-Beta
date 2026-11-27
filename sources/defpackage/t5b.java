package defpackage;

import java.util.List;
public final class t5b implements qcc {
    public final u5b a;
    public final boolean b;
    public final int c;
    public final List d;

    public t5b(u5b u5bVar, boolean z, int i, List list) {
        this.a = u5bVar;
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
