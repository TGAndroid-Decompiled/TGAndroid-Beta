package l7;
public final class h extends i {
    public final transient int f14669c;
    public final transient int d;
    public final i f14670e;

    public h(i iVar, int i10, int i11) {
        this.f14670e = iVar;
        this.f14669c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.r.a(i10, this.d);
        return this.f14670e.get(i10 + this.f14669c);
    }

    @Override
    public final int n() {
        return this.f14670e.o() + this.f14669c + this.d;
    }

    @Override
    public final int o() {
        return this.f14670e.o() + this.f14669c;
    }

    @Override
    public final Object[] p() {
        return this.f14670e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        i7.r.b(i10, i11, this.d);
        int i12 = this.f14669c;
        return this.f14670e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
