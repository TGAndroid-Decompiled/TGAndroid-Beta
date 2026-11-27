package defpackage;
public final class nbd extends tbd {
    public final transient int r;
    public final transient int s;
    public final tbd w;

    public nbd(tbd tbdVar, int i, int i2) {
        super((byte) 3);
        this.w = tbdVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        t8f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override
    public final Object[] r() {
        return this.w.r();
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
    public final int t() {
        return this.w.s() + this.r + this.s;
    }

    @Override
    public final tbd subList(int i, int i2) {
        t8f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
