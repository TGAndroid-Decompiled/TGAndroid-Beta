package defpackage;
public final class dhd extends ghd {
    public final transient int h;
    public final transient int n;
    public final ghd r;

    public dhd(ghd ghdVar, int i, int i2) {
        super((byte) 1);
        this.r = ghdVar;
        this.h = i;
        this.n = i2;
    }

    @Override
    public final Object get(int i) {
        b9f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override
    public final Object[] k() {
        return this.r.k();
    }

    @Override
    public final ghd subList(int i, int i2) {
        b9f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.n;
    }
}
