package i7;

public final class r extends s {

    public final transient int f10788c;
    public final transient int d;

    public final s f10789e;

    public r(s sVar, int i10, int i11) {
        this.f10789e = sVar;
        this.f10788c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        g7.g8.a(i10, this.d);
        return this.f10789e.get(i10 + this.f10788c);
    }

    @Override
    public final int n() {
        return this.f10789e.o() + this.f10788c + this.d;
    }

    @Override
    public final int o() {
        return this.f10789e.o() + this.f10788c;
    }

    @Override
    public final Object[] p() {
        return this.f10789e.p();
    }

    @Override
    public final s subList(int i10, int i11) {
        g7.g8.b(i10, i11, this.d);
        int i12 = this.f10788c;
        return this.f10789e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
