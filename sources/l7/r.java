package l7;
public final class r extends s {
    public final transient int f12002c;
    public final transient int d;
    public final s f12003e;

    public r(s sVar, int i10, int i11) {
        this.f12003e = sVar;
        this.f12002c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k7.k.a(i10, this.d);
        return this.f12003e.get(i10 + this.f12002c);
    }

    @Override
    public final int n() {
        return this.f12003e.o() + this.f12002c + this.d;
    }

    @Override
    public final int o() {
        return this.f12003e.o() + this.f12002c;
    }

    @Override
    public final Object[] p() {
        return this.f12003e.p();
    }

    @Override
    public final s subList(int i10, int i11) {
        k7.k.b(i10, i11, this.d);
        int i12 = this.f12002c;
        return this.f12003e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
