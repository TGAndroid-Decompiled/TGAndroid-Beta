package defpackage;
public final class qhd extends xhd {
    public final transient int r;
    public final transient int s;
    public final xhd w;

    public qhd(xhd xhdVar, int i, int i2) {
        super((byte) 4);
        this.w = xhdVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        k0f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override
    public final int q() {
        return this.w.s() + this.r + this.s;
    }

    @Override
    public final int s() {
        return this.w.s() + this.r;
    }

    @Override
    public final int size() {
        return this.s;
    }

    @Override
    public final Object[] v() {
        return this.w.v();
    }

    @Override
    public final xhd subList(int i, int i2) {
        k0f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
