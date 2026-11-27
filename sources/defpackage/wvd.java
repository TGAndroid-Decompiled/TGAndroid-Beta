package defpackage;
public final class wvd extends dwd {
    public final transient int c;
    public final transient int d;
    public final dwd e;

    public wvd(dwd dwdVar, int i, int i2) {
        this.e = dwdVar;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Object get(int i) {
        a6f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override
    public final Object[] l() {
        return this.e.l();
    }

    @Override
    public final dwd subList(int i, int i2) {
        a6f.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
