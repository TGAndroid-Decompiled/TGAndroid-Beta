package d9;

import a8.s9;
public final class h extends i {
    public final transient int f7901c;
    public final transient int d;
    public final i f7902e;

    public h(i iVar, int i7, int i10) {
        this.f7902e = iVar;
        this.f7901c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        s9.a(i7, this.d);
        return this.f7902e.get(i7 + this.f7901c);
    }

    @Override
    public final int i() {
        return this.f7902e.j() + this.f7901c + this.d;
    }

    @Override
    public final int j() {
        return this.f7902e.j() + this.f7901c;
    }

    @Override
    public final Object[] k() {
        return this.f7902e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        s9.b(i7, i10, this.d);
        int i11 = this.f7901c;
        return this.f7902e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
