package di;
public final class s {
    public final t f7730a;
    public final int f7731b;
    public final int f7732c;

    public s(t tVar, int i10, int i11) {
        this.f7730a = tVar;
        this.f7731b = i10;
        this.f7732c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f7730a.d[this.f7732c]) * this.f7731b;
    }

    public final float b(float f7) {
        return (f7 / this.f7730a.d[this.f7732c]) * (this.f7731b + 1);
    }
}
