package ci;
public final class s {
    public final t f5477a;
    public final int f5478b;
    public final int f5479c;

    public s(t tVar, int i10, int i11) {
        this.f5477a = tVar;
        this.f5478b = i10;
        this.f5479c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5477a.d[this.f5479c]) * this.f5478b;
    }

    public final float b(float f7) {
        return (f7 / this.f5477a.d[this.f5479c]) * (this.f5478b + 1);
    }
}
