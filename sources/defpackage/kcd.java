package defpackage;
public final class kcd extends ncd {
    public final transient int h;
    public final transient int n;
    public final ncd r;

    public kcd(ncd ncdVar, int i, int i2) {
        super((byte) 1);
        this.r = ncdVar;
        this.h = i;
        this.n = i2;
    }

    @Override
    public final Object get(int i) {
        i4f.a(i, this.n);
        return this.r.get(i + this.h);
    }

    @Override
    public final int i() {
        return this.r.j() + this.h + this.n;
    }

    @Override
    public final int j() {
        return this.r.j() + this.h;
    }

    @Override
    public final Object[] k() {
        return this.r.k();
    }

    @Override
    public final ncd subList(int i, int i2) {
        i4f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.n;
    }
}
