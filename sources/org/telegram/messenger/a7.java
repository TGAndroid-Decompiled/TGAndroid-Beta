package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22838a;
    public final i7 f22839b;
    public final h7 f22840c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22838a = i7;
        this.f22839b = i7Var;
        this.f22840c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22838a) {
            case 0:
                i7 i7Var = this.f22839b;
                i7Var.getClass();
                h7 h7Var = this.f22840c;
                h7Var.f24404l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24403k = true;
                return;
            default:
                i7 i7Var2 = this.f22839b;
                h7 h7Var2 = this.f22840c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24399f.freeResources();
                return;
        }
    }
}
