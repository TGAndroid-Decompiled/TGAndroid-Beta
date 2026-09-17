package di;
public final class s {
    public final t f8114a;
    public final int f8115b;
    public final int f8116c;

    public s(t tVar, int i10, int i11) {
        this.f8114a = tVar;
        this.f8115b = i10;
        this.f8116c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f8114a.d[this.f8116c]) * this.f8115b;
    }

    public final float b(float f7) {
        return (f7 / this.f8114a.d[this.f8116c]) * (this.f8115b + 1);
    }
}
