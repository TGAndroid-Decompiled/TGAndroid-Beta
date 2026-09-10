package bi;
public final class w {
    public final x f3811a;
    public final int f3812b;
    public final int f3813c;

    public w(x xVar, int i10, int i11) {
        this.f3811a = xVar;
        this.f3812b = i10;
        this.f3813c = i11;
    }

    public final float a(float f7) {
        return (f7 / this.f3811a.d[this.f3813c]) * this.f3812b;
    }

    public final float b(float f7) {
        return (f7 / this.f3811a.d[this.f3813c]) * (this.f3812b + 1);
    }
}
