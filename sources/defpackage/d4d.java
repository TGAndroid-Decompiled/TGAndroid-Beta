package defpackage;
public final class d4d extends e4d {
    public final transient int r;
    public final transient int s;
    public final e4d w;

    public d4d(e4d e4dVar, int i, int i2) {
        super((byte) 1);
        this.w = e4dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        yye.a(i, this.s);
        return this.w.get(i + this.r);
    }

    @Override
    public final int m() {
        return this.w.n() + this.r + this.s;
    }

    @Override
    public final int n() {
        return this.w.n() + this.r;
    }

    @Override
    public final Object[] o() {
        return this.w.o();
    }

    @Override
    public final int size() {
        return this.s;
    }

    @Override
    public final e4d subList(int i, int i2) {
        yye.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
