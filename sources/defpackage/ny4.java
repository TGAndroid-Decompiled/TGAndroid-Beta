package defpackage;
public final class ny4 implements dic {
    public int a;
    public final d04 b;
    public final vy4 c;

    public ny4(vy4 vy4Var, d04 d04Var) {
        this.c = vy4Var;
        this.b = d04Var;
        this.a = d04Var.getScrollX();
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
