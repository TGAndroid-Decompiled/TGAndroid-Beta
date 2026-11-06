package fi;
public final class s {
    public final t f12763a;
    public final int f12764b;
    public final int f12765c;

    public s(t tVar, int i7, int i10) {
        this.f12763a = tVar;
        this.f12764b = i7;
        this.f12765c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f12763a.d[this.f12765c]) * this.f12764b;
    }

    public final float b(float f10) {
        return (f10 / this.f12763a.d[this.f12765c]) * (this.f12764b + 1);
    }
}
