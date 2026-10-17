package ei;
public final class s {
    public final t f9759a;
    public final int f9760b;
    public final int f9761c;

    public s(t tVar, int i10, int i11) {
        this.f9759a = tVar;
        this.f9760b = i10;
        this.f9761c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f9759a.d[this.f9761c]) * this.f9760b;
    }

    public final float b(float f7) {
        return (f7 / this.f9759a.d[this.f9761c]) * (this.f9760b + 1);
    }
}
