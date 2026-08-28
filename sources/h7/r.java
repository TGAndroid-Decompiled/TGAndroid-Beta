package h7;
public final class r extends s {
    public final transient int f10079c;
    public final transient int d;
    public final s f10080e;

    public r(s sVar, int i9, int i10) {
        this.f10080e = sVar;
        this.f10079c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        f7.b8.a(i9, this.d);
        return this.f10080e.get(i9 + this.f10079c);
    }

    @Override
    public final int n() {
        return this.f10080e.o() + this.f10079c + this.d;
    }

    @Override
    public final int o() {
        return this.f10080e.o() + this.f10079c;
    }

    @Override
    public final Object[] p() {
        return this.f10080e.p();
    }

    @Override
    public final s subList(int i9, int i10) {
        f7.b8.b(i9, i10, this.d);
        int i11 = this.f10079c;
        return this.f10080e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
