package defpackage;

import java.util.List;
public final class x1b implements q8c {
    public final y1b a;
    public final boolean b;
    public final int c;
    public final List d;

    public x1b(y1b y1bVar, boolean z, int i, List list) {
        this.a = y1bVar;
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
