package ci;
public final class s {
    public final t f5471a;
    public final int f5472b;
    public final int f5473c;

    public s(t tVar, int i10, int i11) {
        this.f5471a = tVar;
        this.f5472b = i10;
        this.f5473c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5471a.d[this.f5473c]) * this.f5472b;
    }

    public final float b(float f7) {
        return (f7 / this.f5471a.d[this.f5473c]) * (this.f5472b + 1);
    }
}
