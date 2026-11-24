package defpackage;
public final class r5e extends x5e {
    public final transient int r;
    public final transient int s;
    public final x5e w;

    public r5e(x5e x5eVar, int i, int i2) {
        super((byte) 5);
        this.w = x5eVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        r3f.a(i, this.s);
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
    public final Object[] x() {
        return this.w.x();
    }

    @Override
    public final x5e subList(int i, int i2) {
        r3f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
