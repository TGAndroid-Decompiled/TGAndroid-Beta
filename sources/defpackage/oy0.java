package defpackage;
public final class oy0 implements my0 {
    public final xu7 a;
    public final int b;
    public final int c;
    public int d;
    public short e;

    public oy0(mf7 mf7Var) {
        xu7 xu7Var = mf7Var.e;
        this.a = xu7Var;
        xu7Var.N(12);
        this.c = xu7Var.E() & 255;
        this.b = xu7Var.E();
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
        xu7 xu7Var = this.a;
        int i = this.c;
        if (i == 8) {
            return xu7Var.A();
        }
        if (i == 16) {
            return xu7Var.H();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            ?? A = xu7Var.A();
            this.e = A;
            return (A & 240) >> 4;
        }
        return this.e & 15;
    }
}
