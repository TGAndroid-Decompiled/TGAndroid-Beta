package defpackage;
public final class wy0 implements uy0 {
    public final ey7 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public wy0(vh7 vh7Var) {
        ey7 ey7Var = vh7Var.e;
        this.a = ey7Var;
        ey7Var.N(12);
        this.c = ey7Var.E() & 255;
        this.b = ey7Var.E();
    }

    @Override
    public final int a() {
        return -1;
    }

    @Override
    public final int b() {
        return this.b;
    }

    @Override
    public final int c() {
        ey7 ey7Var = this.a;
        int i = this.c;
        if (i == 8) {
            return ey7Var.A();
        }
        if (i == 16) {
            return ey7Var.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            ?? A = ey7Var.A();
            this.e = A;
            return (A & 240) >> 4;
        }
        return this.e & 15;
    }
}
