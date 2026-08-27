package g7;

public final class j9 extends k9 {

    public final transient int f6518c;
    public final transient int d;

    public final k9 f6519e;

    public j9(k9 k9Var, int i10, int i11) {
        this.f6519e = k9Var;
        this.f6518c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        c7.a(i10, this.d);
        return this.f6519e.get(i10 + this.f6518c);
    }

    @Override
    public final int n() {
        return this.f6519e.o() + this.f6518c + this.d;
    }

    @Override
    public final int o() {
        return this.f6519e.o() + this.f6518c;
    }

    @Override
    public final Object[] p() {
        return this.f6519e.p();
    }

    @Override
    public final k9 subList(int i10, int i11) {
        c7.b(i10, i11, this.d);
        int i12 = this.f6518c;
        return this.f6519e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
