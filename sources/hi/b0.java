package hi;
public final class b0 {
    public final c0 f14210a;
    public final int f14211b;
    public final int f14212c;

    public b0(c0 c0Var, int i7, int i10) {
        this.f14210a = c0Var;
        this.f14211b = i7;
        this.f14212c = i10;
    }

    public final float a(float f10) {
        return (f10 / this.f14210a.d[this.f14212c]) * this.f14211b;
    }

    public final float b(float f10) {
        return (f10 / this.f14210a.d[this.f14212c]) * (this.f14211b + 1);
    }
}
