package ci;
public final class s {
    public final t f5915a;
    public final int f5916b;
    public final int f5917c;

    public s(t tVar, int i10, int i11) {
        this.f5915a = tVar;
        this.f5916b = i10;
        this.f5917c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f5915a.d[this.f5917c]) * this.f5916b;
    }

    public final float b(float f7) {
        return (f7 / this.f5915a.d[this.f5917c]) * (this.f5916b + 1);
    }
}
