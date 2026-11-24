package defpackage;
public final class zed extends efd {
    public final transient int c;
    public final transient int d;
    public final efd e;

    public zed(efd efdVar, int i, int i2) {
        this.e = efdVar;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Object get(int i) {
        sze.a(i, this.d);
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
    public final efd subList(int i, int i2) {
        sze.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
