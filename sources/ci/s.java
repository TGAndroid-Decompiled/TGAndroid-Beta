package ci;
public final class s {
    public final t f5479a;
    public final int f5480b;
    public final int f5481c;

    public s(t tVar, int i10, int i11) {
        this.f5479a = tVar;
        this.f5480b = i10;
        this.f5481c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5479a.d[this.f5481c]) * this.f5480b;
    }

    public final float b(float f7) {
        return (f7 / this.f5479a.d[this.f5481c]) * (this.f5480b + 1);
    }
}
