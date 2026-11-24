package defpackage;
public final class iw4 implements eec {
    public int a;
    public final iz3 b;
    public final qw4 c;

    public iw4(qw4 qw4Var, iz3 iz3Var) {
        this.c = qw4Var;
        this.b = iz3Var;
        this.a = iz3Var.getScrollX();
    }

    @Override
    public final void b(float f, int i, int i2) {
        int scrollX = this.b.getScrollX();
        this.c.h(scrollX - this.a, 0);
        this.a = scrollX;
    }

    @Override
    public final void c(int i) {
        this.c.g++;
    }

    @Override
    public final void a(int i) {
    }
}
