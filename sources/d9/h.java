package d9;

import a8.o9;
public final class h extends i {
    public final transient int f8241c;
    public final transient int d;
    public final i f8242e;

    public h(i iVar, int i7, int i10) {
        this.f8242e = iVar;
        this.f8241c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        o9.a(i7, this.d);
        return this.f8242e.get(i7 + this.f8241c);
    }

    @Override
    public final int i() {
        return this.f8242e.j() + this.f8241c + this.d;
    }

    @Override
    public final int j() {
        return this.f8242e.j() + this.f8241c;
    }

    @Override
    public final Object[] k() {
        return this.f8242e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        o9.b(i7, i10, this.d);
        int i11 = this.f8241c;
        return this.f8242e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
