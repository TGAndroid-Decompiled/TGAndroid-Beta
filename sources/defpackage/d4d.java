package defpackage;
public final class d4d extends e4d {
    public final transient int r;
    public final transient int s;
    public final e4d w;

    public d4d(e4d e4dVar, int i, int i2) {
        super((byte) 0);
        this.w = e4dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        i3f.a(i, this.s);
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
    public final e4d subList(int i, int i2) {
        i3f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
