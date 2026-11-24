package defpackage;
public final class l8d extends t8d {
    public final transient int r;
    public final transient int s;
    public final t8d w;

    public l8d(t8d t8dVar, int i, int i2) {
        super((byte) 2);
        this.w = t8dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        m6f.a(i, this.s);
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
    public final t8d subList(int i, int i2) {
        m6f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
