package a8;
public final class t extends u {
    public final transient int f641c;
    public final transient int d;
    public final u f642e;

    public t(u uVar, int i7, int i10) {
        this.f642e = uVar;
        this.f641c = i7;
        this.d = i10;
    }

    @Override
    public final Object get(int i7) {
        x0.a(i7, this.d);
        return this.f642e.get(i7 + this.f641c);
    }

    @Override
    public final int i() {
        return this.f642e.j() + this.f641c + this.d;
    }

    @Override
    public final int j() {
        return this.f642e.j() + this.f641c;
    }

    @Override
    public final Object[] k() {
        return this.f642e.k();
    }

    @Override
    public final u subList(int i7, int i10) {
        x0.b(i7, i10, this.d);
        int i11 = this.f641c;
        return this.f642e.subList(i7 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
