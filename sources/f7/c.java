package f7;

import g7.x6;

public final class c extends d {

    public final transient int f5902c;
    public final transient int d;

    public final d f5903e;

    public c(d dVar, int i10, int i11) {
        this.f5903e = dVar;
        this.f5902c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        x6.a(i10, this.d);
        return this.f5903e.get(i10 + this.f5902c);
    }

    @Override
    public final int n() {
        return this.f5903e.o() + this.f5902c + this.d;
    }

    @Override
    public final int o() {
        return this.f5903e.o() + this.f5902c;
    }

    @Override
    public final Object[] p() {
        return this.f5903e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        x6.b(i10, i11, this.d);
        int i12 = this.f5902c;
        return this.f5903e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
