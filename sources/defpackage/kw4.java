package defpackage;
public final class kw4 implements Runnable {
    public int a;
    public int b;
    public final tu9 c;
    public final qw4 d;

    public kw4(qw4 qw4Var, tu9 tu9Var) {
        this.d = qw4Var;
        this.c = tu9Var;
    }

    @Override
    public final void run() {
        tu9 tu9Var = this.c;
        int scrollX = tu9Var.getScrollX();
        int scrollY = tu9Var.getScrollY();
        qw4 qw4Var = this.d;
        qw4Var.k += scrollX - this.a;
        qw4Var.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        qw4Var.g++;
    }
}
