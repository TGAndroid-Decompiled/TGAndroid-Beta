package ci;
public final class s {
    public final t f5480a;
    public final int f5481b;
    public final int f5482c;

    public s(t tVar, int i10, int i11) {
        this.f5480a = tVar;
        this.f5481b = i10;
        this.f5482c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5480a.d[this.f5482c]) * this.f5481b;
    }

    public final float b(float f7) {
        return (f7 / this.f5480a.d[this.f5482c]) * (this.f5481b + 1);
    }
}
