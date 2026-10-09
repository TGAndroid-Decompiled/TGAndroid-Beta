package ci;
public final class s {
    public final t f5917a;
    public final int f5918b;
    public final int f5919c;

    public s(t tVar, int i10, int i11) {
        this.f5917a = tVar;
        this.f5918b = i10;
        this.f5919c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5917a.d[this.f5919c]) * this.f5918b;
    }

    public final float b(float f7) {
        return (f7 / this.f5917a.d[this.f5919c]) * (this.f5918b + 1);
    }
}
