package defpackage;
public final class e8e extends k8e {
    public final transient int r;
    public final transient int s;
    public final k8e w;

    public e8e(k8e k8eVar, int i, int i2) {
        super((byte) 5);
        this.w = k8eVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        h6f.a(i, this.s);
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
    public final k8e subList(int i, int i2) {
        h6f.c(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
