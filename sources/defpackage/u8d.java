package defpackage;
public final class u8d extends v8d {
    public final transient int r;
    public final transient int s;
    public final v8d w;

    public u8d(v8d v8dVar, int i, int i2) {
        super((byte) 1);
        this.w = v8dVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        q3f.a(i, this.s);
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
    public final v8d subList(int i, int i2) {
        q3f.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
