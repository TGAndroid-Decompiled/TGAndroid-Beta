package ci;
public final class s {
    public final t f5467a;
    public final int f5468b;
    public final int f5469c;

    public s(t tVar, int i10, int i11) {
        this.f5467a = tVar;
        this.f5468b = i10;
        this.f5469c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5467a.d[this.f5469c]) * this.f5468b;
    }

    public final float b(float f7) {
        return (f7 / this.f5467a.d[this.f5469c]) * (this.f5468b + 1);
    }
}
