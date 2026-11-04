package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f21468a;
    public final i7 f21469b;
    public final h7 f21470c;

    public a7(i7 i7Var, h7 h7Var, int i3) {
        this.f21468a = i3;
        this.f21469b = i7Var;
        this.f21470c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21468a) {
            case 0:
                i7 i7Var = this.f21469b;
                i7Var.getClass();
                h7 h7Var = this.f21470c;
                h7Var.f22899l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f22898k = true;
                return;
            default:
                i7 i7Var2 = this.f21469b;
                h7 h7Var2 = this.f21470c;
                i7Var2.m(h7Var2, null);
                h7Var2.f22894f.freeResources();
                return;
        }
    }
}
