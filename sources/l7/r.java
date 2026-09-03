package l7;
public final class r extends s {
    public final transient int f11716c;
    public final transient int d;
    public final s e;

    public r(s sVar, int i10, int i11) {
        this.e = sVar;
        this.f11716c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k7.j.a(i10, this.d);
        return this.e.get(i10 + this.f11716c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f11716c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f11716c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final s subList(int i10, int i11) {
        k7.j.b(i10, i11, this.d);
        int i12 = this.f11716c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
