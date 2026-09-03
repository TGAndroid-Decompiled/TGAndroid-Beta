package b7;
public final class n extends o {
    public final transient int f1717c;
    public final transient int d;
    public final o e;

    public n(o oVar, int i10, int i11) {
        this.e = oVar;
        this.f1717c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        b.e(i10, this.d);
        return this.e.get(i10 + this.f1717c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f1717c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f1717c;
    }

    @Override
    public final Object[] q() {
        return this.e.q();
    }

    @Override
    public final o subList(int i10, int i11) {
        b.m(i10, i11, this.d);
        int i12 = this.f1717c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
