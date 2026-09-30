package ci;
public final class s {
    public final t f5476a;
    public final int f5477b;
    public final int f5478c;

    public s(t tVar, int i10, int i11) {
        this.f5476a = tVar;
        this.f5477b = i10;
        this.f5478c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5476a.d[this.f5478c]) * this.f5477b;
    }

    public final float b(float f7) {
        return (f7 / this.f5476a.d[this.f5478c]) * (this.f5477b + 1);
    }
}
