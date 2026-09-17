package di;
public final class s {
    public final t f8086a;
    public final int f8087b;
    public final int f8088c;

    public s(t tVar, int i10, int i11) {
        this.f8086a = tVar;
        this.f8087b = i10;
        this.f8088c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f8086a.d[this.f8088c]) * this.f8087b;
    }

    public final float b(float f7) {
        return (f7 / this.f8086a.d[this.f8088c]) * (this.f8087b + 1);
    }
}
