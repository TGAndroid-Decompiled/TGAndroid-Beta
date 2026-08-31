package n7;
public final class h extends i {
    public final transient int f15434c;
    public final transient int d;
    public final i f15435e;

    public h(i iVar, int i10, int i11) {
        this.f15435e = iVar;
        this.f15434c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        k7.f0.a(i10, this.d);
        return this.f15435e.get(i10 + this.f15434c);
    }

    @Override
    public final int n() {
        return this.f15435e.o() + this.f15434c + this.d;
    }

    @Override
    public final int o() {
        return this.f15435e.o() + this.f15434c;
    }

    @Override
    public final Object[] p() {
        return this.f15435e.p();
    }

    @Override
    public final i subList(int i10, int i11) {
        k7.f0.b(i10, i11, this.d);
        int i12 = this.f15434c;
        return this.f15435e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
