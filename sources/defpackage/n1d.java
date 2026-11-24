package defpackage;
public final class n1d extends o1d {
    public final transient int r;
    public final transient int s;
    public final o1d w;

    public n1d(o1d o1dVar, int i, int i2) {
        super((byte) 0);
        this.w = o1dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        s0f.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override
    public final int i() {
        return this.w.j() + this.r + this.s;
    }

    @Override
    public final int j() {
        return this.w.j() + this.r;
    }

    @Override
    public final Object[] k() {
        return this.w.k();
    }

    @Override
    public final int size() {
        return this.s;
    }

    @Override
    public final o1d subList(int i, int i2) {
        s0f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
