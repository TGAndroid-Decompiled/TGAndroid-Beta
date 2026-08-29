package h7;
public final class i9 extends j9 {
    public final transient int f7650c;
    public final transient int d;
    public final j9 f7651e;

    public i9(j9 j9Var, int i10, int i11) {
        this.f7651e = j9Var;
        this.f7650c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        t7.a(i10, this.d);
        return this.f7651e.get(i10 + this.f7650c);
    }

    @Override
    public final int n() {
        return this.f7651e.o() + this.f7650c + this.d;
    }

    @Override
    public final int o() {
        return this.f7651e.o() + this.f7650c;
    }

    @Override
    public final Object[] p() {
        return this.f7651e.p();
    }

    @Override
    public final j9 subList(int i10, int i11) {
        t7.b(i10, i11, this.d);
        int i12 = this.f7650c;
        return this.f7651e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
