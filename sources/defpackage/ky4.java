package defpackage;
public final class ky4 implements egc {
    public int a;
    public final s04 b;
    public final sy4 c;

    public ky4(sy4 sy4Var, s04 s04Var) {
        this.c = sy4Var;
        this.b = s04Var;
        this.a = s04Var.getScrollX();
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
