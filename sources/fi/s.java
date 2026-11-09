package fi;
public final class s {
    public final t f12762a;
    public final int f12763b;
    public final int f12764c;

    public s(t tVar, int i7, int i10) {
        this.f12762a = tVar;
        this.f12763b = i7;
        this.f12764c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f12762a.d[this.f12764c]) * this.f12763b;
    }

    public final float b(float f10) {
        return (f10 / this.f12762a.d[this.f12764c]) * (this.f12763b + 1);
    }
}
