package ei;
public final class s {
    public final t f9757a;
    public final int f9758b;
    public final int f9759c;

    public s(t tVar, int i10, int i11) {
        this.f9757a = tVar;
        this.f9758b = i10;
        this.f9759c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f9757a.d[this.f9759c]) * this.f9758b;
    }

    public final float b(float f7) {
        return (f7 / this.f9757a.d[this.f9759c]) * (this.f9758b + 1);
    }
}
