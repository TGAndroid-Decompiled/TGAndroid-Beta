package g7;
public final class qa extends ra {
    public final transient int f7352c;
    public final transient int d;
    public final ra f7353e;

    public qa(ra raVar, int i9, int i10) {
        this.f7353e = raVar;
        this.f7352c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        f7.p7.a(i9, this.d);
        return this.f7353e.get(i9 + this.f7352c);
    }

    @Override
    public final int n() {
        return this.f7353e.o() + this.f7352c + this.d;
    }

    @Override
    public final int o() {
        return this.f7353e.o() + this.f7352c;
    }

    @Override
    public final Object[] p() {
        return this.f7353e.p();
    }

    @Override
    public final ra subList(int i9, int i10) {
        f7.p7.b(i9, i10, this.d);
        int i11 = this.f7352c;
        return this.f7353e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
