package b8;
public final class k extends l {
    public final transient int f2701c;
    public final transient int d;
    public final l f2702e;

    public k(l lVar, int i3, int i10) {
        this.f2702e = lVar;
        this.f2701c = i3;
        this.d = i10;
    }

    @Override
    public final Object get(int i3) {
        n1.a(i3, this.d);
        return this.f2702e.get(i3 + this.f2701c);
    }

    @Override
    public final int i() {
        return this.f2702e.j() + this.f2701c + this.d;
    }

    @Override
    public final int j() {
        return this.f2702e.j() + this.f2701c;
    }

    @Override
    public final Object[] k() {
        return this.f2702e.k();
    }

    @Override
    public final l subList(int i3, int i10) {
        n1.b(i3, i10, this.d);
        int i11 = this.f2701c;
        return this.f2702e.subList(i3 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
