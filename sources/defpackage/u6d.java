package defpackage;
public final class u6d extends a7d {
    public final transient int r;
    public final transient int s;
    public final a7d w;

    public u6d(a7d a7dVar, int i, int i2) {
        super((byte) 3);
        this.w = a7dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        u3f.a(i, this.s);
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
    public final a7d subList(int i, int i2) {
        u3f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
