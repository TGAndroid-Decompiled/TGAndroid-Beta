package defpackage;
public final class cbd extends kbd {
    public final transient int r;
    public final transient int s;
    public final kbd w;

    public cbd(kbd kbdVar, int i, int i2) {
        super((byte) 2);
        this.w = kbdVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        d9f.a(i, this.s);
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
    public final kbd subList(int i, int i2) {
        d9f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
