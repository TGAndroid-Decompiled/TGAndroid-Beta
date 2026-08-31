package k7;
public final class qa extends ra {
    public final transient int f10707c;
    public final transient int d;
    public final ra f10708e;

    public qa(ra raVar, int i10, int i11) {
        this.f10708e = raVar;
        this.f10707c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        j7.u8.a(i10, this.d);
        return this.f10708e.get(i10 + this.f10707c);
    }

    @Override
    public final int n() {
        return this.f10708e.o() + this.f10707c + this.d;
    }

    @Override
    public final int o() {
        return this.f10708e.o() + this.f10707c;
    }

    @Override
    public final Object[] p() {
        return this.f10708e.p();
    }

    @Override
    public final ra subList(int i10, int i11) {
        j7.u8.b(i10, i11, this.d);
        int i12 = this.f10707c;
        return this.f10708e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
