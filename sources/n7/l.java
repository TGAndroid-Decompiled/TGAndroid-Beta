package n7;
public final class l extends m {
    public final transient int f16809c;
    public final transient int d;
    public final m f16810e;

    public l(m mVar, int i10, int i11) {
        this.f16810e = mVar;
        this.f16809c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.f16810e.get(i10 + this.f16809c);
    }

    @Override
    public final int n() {
        return this.f16810e.o() + this.f16809c + this.d;
    }

    @Override
    public final int o() {
        return this.f16810e.o() + this.f16809c;
    }

    @Override
    public final Object[] q() {
        return this.f16810e.q();
    }

    @Override
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f16809c;
        return this.f16810e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
