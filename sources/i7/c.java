package i7;

import j7.d8;
public final class c extends d {
    public final transient int f7918c;
    public final transient int d;
    public final d f7919e;

    public c(d dVar, int i10, int i11) {
        this.f7919e = dVar;
        this.f7918c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        d8.a(i10, this.d);
        return this.f7919e.get(i10 + this.f7918c);
    }

    @Override
    public final int n() {
        return this.f7919e.o() + this.f7918c + this.d;
    }

    @Override
    public final int o() {
        return this.f7919e.o() + this.f7918c;
    }

    @Override
    public final Object[] p() {
        return this.f7919e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        d8.b(i10, i11, this.d);
        int i12 = this.f7918c;
        return this.f7919e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
