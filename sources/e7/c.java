package e7;

import g7.s6;

public final class c extends d {

    public final transient int f5317c;
    public final transient int d;

    public final d f5318e;

    public c(d dVar, int i10, int i11) {
        this.f5318e = dVar;
        this.f5317c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        s6.a(i10, this.d);
        return this.f5318e.get(i10 + this.f5317c);
    }

    @Override
    public final int n() {
        return this.f5318e.o() + this.f5317c + this.d;
    }

    @Override
    public final int o() {
        return this.f5318e.o() + this.f5317c;
    }

    @Override
    public final Object[] p() {
        return this.f5318e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        s6.c(i10, i11, this.d);
        int i12 = this.f5317c;
        return this.f5318e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
