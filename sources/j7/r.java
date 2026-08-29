package j7;
public final class r extends s {
    public final transient int f11161c;
    public final transient int d;
    public final s f11162e;

    public r(s sVar, int i10, int i11) {
        this.f11162e = sVar;
        this.f11161c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        h7.u8.a(i10, this.d);
        return this.f11162e.get(i10 + this.f11161c);
    }

    @Override
    public final int n() {
        return this.f11162e.o() + this.f11161c + this.d;
    }

    @Override
    public final int o() {
        return this.f11162e.o() + this.f11161c;
    }

    @Override
    public final Object[] p() {
        return this.f11162e.p();
    }

    @Override
    public final s subList(int i10, int i11) {
        h7.u8.b(i10, i11, this.d);
        int i12 = this.f11161c;
        return this.f11162e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
