package fi;
public final class s {
    public final t f11569a;
    public final int f11570b;
    public final int f11571c;

    public s(t tVar, int i10, int i11) {
        this.f11569a = tVar;
        this.f11570b = i10;
        this.f11571c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f11569a.d[this.f11571c]) * this.f11570b;
    }

    public final float b(float f7) {
        return (f7 / this.f11569a.d[this.f11571c]) * (this.f11570b + 1);
    }
}
