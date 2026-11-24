package defpackage;
public final class x4f extends f7f {
    public final transient int h;
    public final transient int n;
    public final f7f r;

    public x4f(f7f f7fVar, int i, int i2) {
        super((byte) 2);
        this.r = f7fVar;
        this.h = i;
        this.n = i2;
    }

    @Override
    public final Object get(int i) {
        q1f.a(i, this.n);
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
    public final f7f subList(int i, int i2) {
        q1f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.n;
    }
}
