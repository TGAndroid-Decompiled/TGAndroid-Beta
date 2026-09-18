package n7;
public final class l extends m {
    public final transient int f15326c;
    public final transient int d;
    public final m e;

    public l(m mVar, int i10, int i11) {
        this.e = mVar;
        this.f15326c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.e.get(i10 + this.f15326c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f15326c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f15326c;
    }

    @Override
    public final Object[] q() {
        return this.e.q();
    }

    @Override
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f15326c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
