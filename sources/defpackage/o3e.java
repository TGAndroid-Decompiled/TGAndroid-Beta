package defpackage;
public final class o3e extends u3e {
    public final transient int r;
    public final transient int s;
    public final u3e w;

    public o3e(u3e u3eVar, int i, int i2) {
        super((byte) 5);
        this.w = u3eVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        p1f.a(i, this.s);
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
    public final Object[] x() {
        return this.w.x();
    }

    @Override
    public final u3e subList(int i, int i2) {
        p1f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
