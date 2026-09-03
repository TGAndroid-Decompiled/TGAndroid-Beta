package j7;
public final class k9 extends l9 {
    public final transient int f9049c;
    public final transient int d;
    public final l9 e;

    public k9(l9 l9Var, int i10, int i11) {
        this.e = l9Var;
        this.f9049c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k8.a(i10, this.d);
        return this.e.get(i10 + this.f9049c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f9049c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f9049c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final l9 subList(int i10, int i11) {
        k8.b(i10, i11, this.d);
        int i12 = this.f9049c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
