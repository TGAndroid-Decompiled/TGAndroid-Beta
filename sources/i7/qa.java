package i7;
public final class qa extends ra {
    public final transient int f8489c;
    public final transient int d;
    public final ra f8490e;

    public qa(ra raVar, int i10, int i11) {
        this.f8490e = raVar;
        this.f8489c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        h7.h8.a(i10, this.d);
        return this.f8490e.get(i10 + this.f8489c);
    }

    @Override
    public final int n() {
        return this.f8490e.o() + this.f8489c + this.d;
    }

    @Override
    public final int o() {
        return this.f8490e.o() + this.f8489c;
    }

    @Override
    public final Object[] p() {
        return this.f8490e.p();
    }

    @Override
    public final ra subList(int i10, int i11) {
        h7.h8.b(i10, i11, this.d);
        int i12 = this.f8489c;
        return this.f8490e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
