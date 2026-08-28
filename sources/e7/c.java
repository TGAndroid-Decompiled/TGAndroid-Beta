package e7;

import f7.x6;
public final class c extends d {
    public final transient int f4973c;
    public final transient int d;
    public final d f4974e;

    public c(d dVar, int i9, int i10) {
        this.f4974e = dVar;
        this.f4973c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        x6.a(i9, this.d);
        return this.f4974e.get(i9 + this.f4973c);
    }

    @Override
    public final int n() {
        return this.f4974e.o() + this.f4973c + this.d;
    }

    @Override
    public final int o() {
        return this.f4974e.o() + this.f4973c;
    }

    @Override
    public final Object[] p() {
        return this.f4974e.p();
    }

    @Override
    public final d subList(int i9, int i10) {
        x6.b(i9, i10, this.d);
        int i11 = this.f4973c;
        return this.f4974e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
