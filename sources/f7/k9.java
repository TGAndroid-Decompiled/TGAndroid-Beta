package f7;
public final class k9 extends l9 {
    public final transient int f5732c;
    public final transient int d;
    public final l9 f5733e;

    public k9(l9 l9Var, int i9, int i10) {
        this.f5733e = l9Var;
        this.f5732c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        a7.a(i9, this.d);
        return this.f5733e.get(i9 + this.f5732c);
    }

    @Override
    public final int n() {
        return this.f5733e.o() + this.f5732c + this.d;
    }

    @Override
    public final int o() {
        return this.f5733e.o() + this.f5732c;
    }

    @Override
    public final Object[] p() {
        return this.f5733e.p();
    }

    @Override
    public final l9 subList(int i9, int i10) {
        a7.b(i9, i10, this.d);
        int i11 = this.f5732c;
        return this.f5733e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
