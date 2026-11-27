package defpackage;
public final class py4 implements Runnable {
    public int a;
    public int b;
    public final ny9 c;
    public final vy4 d;

    public py4(vy4 vy4Var, ny9 ny9Var) {
        this.d = vy4Var;
        this.c = ny9Var;
    }

    @Override
    public final void run() {
        ny9 ny9Var = this.c;
        int scrollX = ny9Var.getScrollX();
        int scrollY = ny9Var.getScrollY();
        vy4 vy4Var = this.d;
        vy4Var.k = (scrollX - this.a) + vy4Var.k;
        vy4Var.l = (scrollY - this.b) + vy4Var.l;
        this.a = scrollX;
        this.b = scrollY;
        vy4Var.g++;
    }
}
