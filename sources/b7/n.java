package b7;
public final class n extends o {
    public final transient int f1846c;
    public final transient int d;
    public final o f1847e;

    public n(o oVar, int i10, int i11) {
        this.f1847e = oVar;
        this.f1846c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b.e(i10, this.d);
        return this.f1847e.get(i10 + this.f1846c);
    }

    @Override
    public final int n() {
        return this.f1847e.o() + this.f1846c + this.d;
    }

    @Override
    public final int o() {
        return this.f1847e.o() + this.f1846c;
    }

    @Override
    public final Object[] q() {
        return this.f1847e.q();
    }

    @Override
    public final o subList(int i10, int i11) {
        b.m(i10, i11, this.d);
        int i12 = this.f1846c;
        return this.f1847e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
