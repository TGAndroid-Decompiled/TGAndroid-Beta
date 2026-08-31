package h7;

import j7.u7;
public final class c extends d {
    public final transient int f7322c;
    public final transient int d;
    public final d f7323e;

    public c(d dVar, int i10, int i11) {
        this.f7323e = dVar;
        this.f7322c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        u7.a(i10, this.d);
        return this.f7323e.get(i10 + this.f7322c);
    }

    @Override
    public final int n() {
        return this.f7323e.o() + this.f7322c + this.d;
    }

    @Override
    public final int o() {
        return this.f7323e.o() + this.f7322c;
    }

    @Override
    public final Object[] p() {
        return this.f7323e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        u7.c(i10, i11, this.d);
        int i12 = this.f7322c;
        return this.f7323e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
