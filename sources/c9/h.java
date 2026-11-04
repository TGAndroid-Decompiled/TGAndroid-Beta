package c9;

import b8.q9;
public final class h extends i {
    public final transient int f4264c;
    public final transient int d;
    public final i f4265e;

    public h(i iVar, int i3, int i10) {
        this.f4265e = iVar;
        this.f4264c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        q9.a(i3, this.d);
        return this.f4265e.get(i3 + this.f4264c);
    }

    @Override
    public final int i() {
        return this.f4265e.j() + this.f4264c + this.d;
    }

    @Override
    public final int j() {
        return this.f4265e.j() + this.f4264c;
    }

    @Override
    public final Object[] k() {
        return this.f4265e.k();
    }

    @Override
    public final i subList(int i3, int i10) {
        q9.b(i3, i10, this.d);
        int i11 = this.f4264c;
        return this.f4265e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
