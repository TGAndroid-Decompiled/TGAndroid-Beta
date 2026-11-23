package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22878a;
    public final i7 f22879b;
    public final h7 f22880c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22878a = i7;
        this.f22879b = i7Var;
        this.f22880c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22878a) {
            case 0:
                i7 i7Var = this.f22879b;
                i7Var.getClass();
                h7 h7Var = this.f22880c;
                h7Var.f24412l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24411k = true;
                return;
            default:
                i7 i7Var2 = this.f22879b;
                h7 h7Var2 = this.f22880c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24407f.freeResources();
                return;
        }
    }
}
