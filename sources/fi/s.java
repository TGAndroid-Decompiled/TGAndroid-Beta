package fi;
public final class s {
    public final t f11568a;
    public final int f11569b;
    public final int f11570c;

    public s(t tVar, int i10, int i11) {
        this.f11568a = tVar;
        this.f11569b = i10;
        this.f11570c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f11568a.d[this.f11570c]) * this.f11569b;
    }

    public final float b(float f7) {
        return (f7 / this.f11568a.d[this.f11570c]) * (this.f11569b + 1);
    }
}
