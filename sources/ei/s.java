package ei;
public final class s {
    public final t f9773a;
    public final int f9774b;
    public final int f9775c;

    public s(t tVar, int i10, int i11) {
        this.f9773a = tVar;
        this.f9774b = i10;
        this.f9775c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f9773a.d[this.f9775c]) * this.f9774b;
    }

    public final float b(float f7) {
        return (f7 / this.f9773a.d[this.f9775c]) * (this.f9774b + 1);
    }
}
