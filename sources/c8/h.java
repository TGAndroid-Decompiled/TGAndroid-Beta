package c8;
public final class h extends i {
    public final transient int f4518c;
    public final transient int d;
    public final i f4519e;

    public h(i iVar, int i7, int i10) {
        this.f4519e = iVar;
        this.f4518c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        a8.g8.a(i7, this.d);
        return this.f4519e.get(i7 + this.f4518c);
    }

    @Override
    public final int i() {
        return this.f4519e.j() + this.f4518c + this.d;
    }

    @Override
    public final int j() {
        return this.f4519e.j() + this.f4518c;
    }

    @Override
    public final Object[] k() {
        return this.f4519e.k();
    }

    @Override
    public final i subList(int i7, int i10) {
        a8.g8.b(i7, i10, this.d);
        int i11 = this.f4518c;
        return this.f4519e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
