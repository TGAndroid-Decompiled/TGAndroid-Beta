package ci;
public final class s {
    public final t f5475a;
    public final int f5476b;
    public final int f5477c;

    public s(t tVar, int i10, int i11) {
        this.f5475a = tVar;
        this.f5476b = i10;
        this.f5477c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5475a.d[this.f5477c]) * this.f5476b;
    }

    public final float b(float f7) {
        return (f7 / this.f5475a.d[this.f5477c]) * (this.f5476b + 1);
    }
}
