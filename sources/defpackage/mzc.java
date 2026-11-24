package defpackage;
public final class mzc extends nzc {
    public final transient int r;
    public final transient int s;
    public final nzc w;

    public mzc(nzc nzcVar, int i, int i2) {
        super((byte) 0);
        this.w = nzcVar;
        this.r = i;
        this.s = i2;
    }

    @Override
    public final Object get(int i) {
        qye.a(i, this.s);
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
    public final nzc subList(int i, int i2) {
        qye.b(i, i2, this.s);
        int i3 = this.r;
        return this.w.subList(i + i3, i2 + i3);
    }
}
