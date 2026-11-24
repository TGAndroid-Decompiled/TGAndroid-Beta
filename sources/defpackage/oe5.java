package defpackage;

import java.util.List;
public final class oe5 extends pg0 {
    public final List d;
    public final long e;

    public oe5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override
    public final long a() {
        b();
        return this.e + ((bf5) this.d.get((int) this.c)).e;
    }

    @Override
    public final long h() {
        b();
        bf5 bf5Var = (bf5) this.d.get((int) this.c);
        return this.e + bf5Var.e + bf5Var.c;
    }
}
