package defpackage;
public final class qjd extends vjd {
    public final transient int c;
    public final transient int d;
    public final vjd e;

    public qjd(vjd vjdVar, int i, int i2) {
        this.e = vjdVar;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Object get(int i) {
        k4f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final Object[] m() {
        return this.e.m();
    }

    @Override
    public final vjd subList(int i, int i2) {
        k4f.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
