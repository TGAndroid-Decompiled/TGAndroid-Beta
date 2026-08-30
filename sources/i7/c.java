package i7;

import j7.c8;
public final class c extends d {
    public final transient int f7359c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f7359c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        c8.a(i10, this.d);
        return this.e.get(i10 + this.f7359c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f7359c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f7359c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        c8.b(i10, i11, this.d);
        int i12 = this.f7359c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
