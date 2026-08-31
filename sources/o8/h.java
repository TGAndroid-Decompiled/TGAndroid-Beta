package o8;
public final class h extends i {
    public final transient int f16644c;
    public final transient int d;
    public final i f16645e;

    public h(i iVar, int i10, int i11) {
        this.f16645e = iVar;
        this.f16644c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k7.j0.a(i10, this.d);
        return this.f16645e.get(i10 + this.f16644c);
    }

    @Override
    public final int n() {
        return this.f16645e.o() + this.f16644c + this.d;
    }

    @Override
    public final int o() {
        return this.f16645e.o() + this.f16644c;
    }

    @Override
    public final Object[] p() {
        return this.f16645e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        k7.j0.b(i10, i11, this.d);
        int i12 = this.f16644c;
        return this.f16645e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
