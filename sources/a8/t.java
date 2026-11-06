package a8;
public final class t extends u {
    public final transient int f645c;
    public final transient int d;
    public final u f646e;

    public t(u uVar, int i7, int i10) {
        this.f646e = uVar;
        this.f645c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        x0.a(i7, this.d);
        return this.f646e.get(i7 + this.f645c);
    }

    @Override
    public final int i() {
        return this.f646e.j() + this.f645c + this.d;
    }

    @Override
    public final int j() {
        return this.f646e.j() + this.f645c;
    }

    @Override
    public final Object[] k() {
        return this.f646e.k();
    }

    @Override
    public final u subList(int i7, int i10) {
        x0.b(i7, i10, this.d);
        int i11 = this.f645c;
        return this.f646e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
