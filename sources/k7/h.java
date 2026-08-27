package k7;

public final class h extends i {

    public final transient int f14664c;
    public final transient int d;

    public final i f14665e;

    public h(i iVar, int i10, int i11) {
        this.f14665e = iVar;
        this.f14664c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        g7.f9.b(i10, this.d);
        return this.f14665e.get(i10 + this.f14664c);
    }

    @Override
    public final int n() {
        return this.f14665e.o() + this.f14664c + this.d;
    }

    @Override
    public final int o() {
        return this.f14665e.o() + this.f14664c;
    }

    @Override
    public final Object[] p() {
        return this.f14665e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        g7.f9.c(i10, i11, this.d);
        int i12 = this.f14664c;
        return this.f14665e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
