package defpackage;
public final class j6d extends r6d {
    public final transient int r;
    public final transient int s;
    public final r6d w;

    public j6d(r6d r6dVar, int i, int i2) {
        super((byte) 2);
        this.w = r6dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        k4f.a(i, this.s);
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
    public final r6d subList(int i, int i2) {
        k4f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
