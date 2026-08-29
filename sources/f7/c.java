package f7;

import h7.i7;
public final class c extends d {
    public final transient int f6654c;
    public final transient int d;
    public final d f6655e;

    public c(d dVar, int i10, int i11) {
        this.f6655e = dVar;
        this.f6654c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.a(i10, this.d);
        return this.f6655e.get(i10 + this.f6654c);
    }

    @Override
    public final int n() {
        return this.f6655e.o() + this.f6654c + this.d;
    }

    @Override
    public final int o() {
        return this.f6655e.o() + this.f6654c;
    }

    @Override
    public final Object[] p() {
        return this.f6655e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        i7.c(i10, i11, this.d);
        int i12 = this.f6654c;
        return this.f6655e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
