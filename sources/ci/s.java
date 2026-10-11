package ci;
public final class s {
    public final t f5916a;
    public final int f5917b;
    public final int f5918c;

    public s(t tVar, int i10, int i11) {
        this.f5916a = tVar;
        this.f5917b = i10;
        this.f5918c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5916a.d[this.f5918c]) * this.f5917b;
    }

    public final float b(float f7) {
        return (f7 / this.f5916a.d[this.f5918c]) * (this.f5917b + 1);
    }
}
