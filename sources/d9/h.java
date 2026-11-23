package d9;

import a8.r9;
public final class h extends i {
    public final transient int f7939c;
    public final transient int d;
    public final i f7940e;

    public h(i iVar, int i7, int i10) {
        this.f7940e = iVar;
        this.f7939c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        r9.a(i7, this.d);
        return this.f7940e.get(i7 + this.f7939c);
    }

    @Override
    public final int i() {
        return this.f7940e.j() + this.f7939c + this.d;
    }

    @Override
    public final int j() {
        return this.f7940e.j() + this.f7939c;
    }

    @Override
    public final Object[] k() {
        return this.f7940e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        r9.b(i7, i10, this.d);
        int i11 = this.f7939c;
        return this.f7940e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
