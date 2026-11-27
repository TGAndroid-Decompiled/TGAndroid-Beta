package defpackage;

import java.util.List;
public final class pg5 extends qg0 {
    public final List d;
    public final long e;

    public pg5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.e + ((dh5) this.d.get((int) this.c)).e;
    }

    @Override
    public final long g() {
        b();
        dh5 dh5Var = (dh5) this.d.get((int) this.c);
        return this.e + dh5Var.e + dh5Var.c;
    }
}
