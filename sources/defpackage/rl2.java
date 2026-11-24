package defpackage;
public final class rl2 {
    public final sl2 a;
    public final int b;
    public final int c;

    public rl2(sl2 sl2Var, int i, int i2) {
        this.a = sl2Var;
        this.b = i;
        this.c = i2;
    }

    public final float a(float f) {
        return (f / this.a.d[this.c]) * this.b;
    }

    public final float b(float f) {
        return (f / this.a.d[this.c]) * (this.b + 1);
    }
}
