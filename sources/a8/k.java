package a8;
public final class k extends l {
    public final transient int f564c;
    public final transient int d;
    public final l e;

    public k(l lVar, int i10, int i11) {
        this.e = lVar;
        this.f564c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        o0.a(i10, this.d);
        return this.e.get(i10 + this.f564c);
    }

    @Override
    public final int m() {
        return this.e.n() + this.f564c + this.d;
    }

    @Override
    public final int n() {
        return this.e.n() + this.f564c;
    }

    @Override
    public final Object[] o() {
        return this.e.o();
    }

    @Override
    public final l subList(int i10, int i11) {
        o0.b(i10, i11, this.d);
        int i12 = this.f564c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
