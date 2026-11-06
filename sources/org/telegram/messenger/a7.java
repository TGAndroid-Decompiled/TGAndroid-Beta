package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f21394a;
    public final i7 f21395b;
    public final h7 f21396c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f21394a = i7;
        this.f21395b = i7Var;
        this.f21396c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21394a) {
            case 0:
                i7 i7Var = this.f21395b;
                i7Var.getClass();
                h7 h7Var = this.f21396c;
                h7Var.f22850l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f22849k = true;
                return;
            default:
                i7 i7Var2 = this.f21395b;
                h7 h7Var2 = this.f21396c;
                i7Var2.m(h7Var2, null);
                h7Var2.f22845f.freeResources();
                return;
        }
    }
}
