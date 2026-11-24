package defpackage;
public final class med extends ped {
    public final transient int h;
    public final transient int n;
    public final ped r;

    public med(ped pedVar, int i, int i2) {
        super((byte) 1);
        this.r = pedVar;
        this.h = i;
        this.n = i2;
    }

    @Override
    public final Object get(int i) {
        k6f.a(i, this.n);
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
    public final ped subList(int i, int i2) {
        k6f.b(i, i2, this.n);
        int i3 = this.h;
        return this.r.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.n;
    }
}
