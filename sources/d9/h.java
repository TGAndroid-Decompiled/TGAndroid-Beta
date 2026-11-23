package d9;

import a8.s9;
public final class h extends i {
    public final transient int f7902c;
    public final transient int d;
    public final i f7903e;

    public h(i iVar, int i7, int i10) {
        this.f7903e = iVar;
        this.f7902c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        s9.a(i7, this.d);
        return this.f7903e.get(i7 + this.f7902c);
    }

    @Override
    public final int i() {
        return this.f7903e.j() + this.f7902c + this.d;
    }

    @Override
    public final int j() {
        return this.f7903e.j() + this.f7902c;
    }

    @Override
    public final Object[] k() {
        return this.f7903e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        s9.b(i7, i10, this.d);
        int i11 = this.f7902c;
        return this.f7903e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
