package defpackage;

import java.util.List;
public final class ng5 extends qh0 {
    public final List d;
    public final long e;

    public ng5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override
    public final long e() {
        a();
        return this.e + ((ah5) this.d.get((int) this.c)).e;
    }

    @Override
    public final long g() {
        a();
        ah5 ah5Var = (ah5) this.d.get((int) this.c);
        return this.e + ah5Var.e + ah5Var.c;
    }
}
