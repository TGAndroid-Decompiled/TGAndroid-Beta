package defpackage;
public final class rjd extends yjd {
    public final transient int r;
    public final transient int s;
    public final yjd w;

    public rjd(yjd yjdVar, int i, int i2) {
        super((byte) 4);
        this.w = yjdVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        m2f.a(i, this.s);
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
    public final yjd subList(int i, int i2) {
        m2f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
