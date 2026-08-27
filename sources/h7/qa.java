package h7;

public final class qa extends ra {

    public final transient int f8522c;
    public final transient int d;

    public final ra f8523e;

    public qa(ra raVar, int i10, int i11) {
        this.f8523e = raVar;
        this.f8522c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        g7.r7.a(i10, this.d);
        return this.f8523e.get(i10 + this.f8522c);
    }

    @Override
    public final int n() {
        return this.f8523e.o() + this.f8522c + this.d;
    }

    @Override
    public final int o() {
        return this.f8523e.o() + this.f8522c;
    }

    @Override
    public final Object[] p() {
        return this.f8523e.p();
    }

    @Override
    public final ra subList(int i10, int i11) {
        g7.r7.b(i10, i11, this.d);
        int i12 = this.f8522c;
        return this.f8523e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
