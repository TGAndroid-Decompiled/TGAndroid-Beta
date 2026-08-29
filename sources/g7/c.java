package g7;

import h7.o7;
public final class c extends d {
    public final transient int f7125c;
    public final transient int d;
    public final d f7126e;

    public c(d dVar, int i10, int i11) {
        this.f7126e = dVar;
        this.f7125c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        o7.a(i10, this.d);
        return this.f7126e.get(i10 + this.f7125c);
    }

    @Override
    public final int n() {
        return this.f7126e.o() + this.f7125c + this.d;
    }

    @Override
    public final int o() {
        return this.f7126e.o() + this.f7125c;
    }

    @Override
    public final Object[] p() {
        return this.f7126e.p();
    }

    @Override
    public final d subList(int i10, int i11) {
        o7.b(i10, i11, this.d);
        int i12 = this.f7125c;
        return this.f7126e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
