package nh;
public final class s {
    public final t f18540a;
    public final int f18541b;
    public final int f18542c;

    public s(t tVar, int i10, int i11) {
        this.f18540a = tVar;
        this.f18541b = i10;
        this.f18542c = i11;
    }

    public final float a(float f9) {
        return (f9 / this.f18540a.d[this.f18542c]) * this.f18541b;
    }

    public final float b(float f9) {
        return (f9 / this.f18540a.d[this.f18542c]) * (this.f18541b + 1);
    }
}
