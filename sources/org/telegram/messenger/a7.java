package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f21392a;
    public final i7 f21393b;
    public final h7 f21394c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f21392a = i7;
        this.f21393b = i7Var;
        this.f21394c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21392a) {
            case 0:
                i7 i7Var = this.f21393b;
                i7Var.getClass();
                h7 h7Var = this.f21394c;
                h7Var.f22856l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f22855k = true;
                return;
            default:
                i7 i7Var2 = this.f21393b;
                h7 h7Var2 = this.f21394c;
                i7Var2.m(h7Var2, null);
                h7Var2.f22851f.freeResources();
                return;
        }
    }
}
