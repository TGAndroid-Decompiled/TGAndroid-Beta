package m8;
public final class h extends i {
    public final transient int f16909c;
    public final transient int d;
    public final i f16910e;

    public h(i iVar, int i10, int i11) {
        this.f16910e = iVar;
        this.f16909c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.y.a(i10, this.d);
        return this.f16910e.get(i10 + this.f16909c);
    }

    @Override
    public final int n() {
        return this.f16910e.o() + this.f16909c + this.d;
    }

    @Override
    public final int o() {
        return this.f16910e.o() + this.f16909c;
    }

    @Override
    public final Object[] p() {
        return this.f16910e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        i7.y.b(i10, i11, this.d);
        int i12 = this.f16909c;
        return this.f16910e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
