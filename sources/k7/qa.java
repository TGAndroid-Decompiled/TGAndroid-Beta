package k7;
public final class qa extends ra {
    public final transient int f9956c;
    public final transient int d;
    public final ra e;

    public qa(ra raVar, int i10, int i11) {
        this.e = raVar;
        this.f9956c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        j7.t8.a(i10, this.d);
        return this.e.get(i10 + this.f9956c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f9956c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f9956c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final ra subList(int i10, int i11) {
        j7.t8.b(i10, i11, this.d);
        int i12 = this.f9956c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
