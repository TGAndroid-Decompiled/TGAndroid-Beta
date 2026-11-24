package defpackage;
public final class vz0 implements tz0 {
    public final yw7 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public vz0(ph7 ph7Var) {
        yw7 yw7Var = ph7Var.e;
        this.a = yw7Var;
        yw7Var.N(12);
        this.c = yw7Var.E() & 255;
        this.b = yw7Var.E();
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
        yw7 yw7Var = this.a;
        int i = this.c;
        if (i == 8) {
            return yw7Var.A();
        }
        if (i == 16) {
            return yw7Var.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            ?? A = yw7Var.A();
            this.e = A;
            return (A & 240) >> 4;
        }
        return this.e & 15;
    }
}
