package o8;
public final class h extends i {
    public final transient int f16485c;
    public final transient int d;
    public final i e;

    public h(i iVar, int i10, int i11) {
        this.e = iVar;
        this.f16485c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k7.i0.a(i10, this.d);
        return this.e.get(i10 + this.f16485c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f16485c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f16485c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        k7.i0.b(i10, i11, this.d);
        int i12 = this.f16485c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
