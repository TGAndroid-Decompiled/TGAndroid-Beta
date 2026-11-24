package defpackage;
public final class my4 implements Runnable {
    public int a;
    public int b;
    public final ww9 c;
    public final sy4 d;

    public my4(sy4 sy4Var, ww9 ww9Var) {
        this.d = sy4Var;
        this.c = ww9Var;
    }

    @Override
    public final void run() {
        ww9 ww9Var = this.c;
        int scrollX = ww9Var.getScrollX();
        int scrollY = ww9Var.getScrollY();
        sy4 sy4Var = this.d;
        sy4Var.k += scrollX - this.a;
        sy4Var.l += scrollY - this.b;
        this.a = scrollX;
        this.b = scrollY;
        sy4Var.g++;
    }
}
