package ei;
public final class s {
    public final t f9760a;
    public final int f9761b;
    public final int f9762c;

    public s(t tVar, int i10, int i11) {
        this.f9760a = tVar;
        this.f9761b = i10;
        this.f9762c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f9760a.d[this.f9762c]) * this.f9761b;
    }

    public final float b(float f7) {
        return (f7 / this.f9760a.d[this.f9762c]) * (this.f9761b + 1);
    }
}
