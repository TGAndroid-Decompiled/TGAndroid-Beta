package fi;
public final class s {
    public final t f12766a;
    public final int f12767b;
    public final int f12768c;

    public s(t tVar, int i7, int i10) {
        this.f12766a = tVar;
        this.f12767b = i7;
        this.f12768c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f12766a.d[this.f12768c]) * this.f12767b;
    }

    public final float b(float f10) {
        return (f10 / this.f12766a.d[this.f12768c]) * (this.f12767b + 1);
    }
}
