package defpackage;
public final class w8d extends c9d {
    public final transient int r;
    public final transient int s;
    public final c9d w;

    public w8d(c9d c9dVar, int i, int i2) {
        super((byte) 3);
        this.w = c9dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        w5f.a(i, this.s);
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
    public final c9d subList(int i, int i2) {
        w5f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
