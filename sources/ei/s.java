package ei;
public final class s {
    public final t f9758a;
    public final int f9759b;
    public final int f9760c;

    public s(t tVar, int i10, int i11) {
        this.f9758a = tVar;
        this.f9759b = i10;
        this.f9760c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f9758a.d[this.f9760c]) * this.f9759b;
    }

    public final float b(float f7) {
        return (f7 / this.f9758a.d[this.f9760c]) * (this.f9759b + 1);
    }
}
