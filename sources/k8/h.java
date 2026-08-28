package k8;
public final class h extends i {
    public final transient int f14688c;
    public final transient int d;
    public final i f14689e;

    public h(i iVar, int i9, int i10) {
        this.f14689e = iVar;
        this.f14688c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        g7.h.a(i9, this.d);
        return this.f14689e.get(i9 + this.f14688c);
    }

    @Override
    public final int n() {
        return this.f14689e.o() + this.f14688c + this.d;
    }

    @Override
    public final int o() {
        return this.f14689e.o() + this.f14688c;
    }

    @Override
    public final Object[] p() {
        return this.f14689e.p();
    }

    @Override
    public final i subList(int i9, int i10) {
        g7.h.b(i9, i10, this.d);
        int i11 = this.f14688c;
        return this.f14689e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
