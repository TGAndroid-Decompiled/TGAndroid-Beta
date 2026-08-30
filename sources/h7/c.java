package h7;

import j7.t7;
public final class c extends d {
    public final transient int f7014c;
    public final transient int d;
    public final d e;

    public c(d dVar, int i10, int i11) {
        this.e = dVar;
        this.f7014c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.e.get(i10 + this.f7014c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f7014c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f7014c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        t7.c(i10, i11, this.d);
        int i12 = this.f7014c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
