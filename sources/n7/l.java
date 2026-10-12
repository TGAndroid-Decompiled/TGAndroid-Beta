package n7;
public final class l extends m {
    public final transient int f16526c;
    public final transient int d;
    public final m f16527e;

    public l(m mVar, int i10, int i11) {
        this.f16527e = mVar;
        this.f16526c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        return this.f16527e.get(i10 + this.f16526c);
    }

    @Override
    public final int n() {
        return this.f16527e.o() + this.f16526c + this.d;
    }

    @Override
    public final int o() {
        return this.f16527e.o() + this.f16526c;
    }

    @Override
    public final Object[] q() {
        return this.f16527e.q();
    }

    @Override
    public final m subList(int i10, int i11) {
        a.m(i10, i11, this.d);
        int i12 = this.f16526c;
        return this.f16527e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
