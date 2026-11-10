package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f21397a;
    public final i7 f21398b;
    public final h7 f21399c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f21397a = i7;
        this.f21398b = i7Var;
        this.f21399c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f21397a) {
            case 0:
                i7 i7Var = this.f21398b;
                i7Var.getClass();
                h7 h7Var = this.f21399c;
                h7Var.f22860l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f22859k = true;
                return;
            default:
                i7 i7Var2 = this.f21398b;
                h7 h7Var2 = this.f21399c;
                i7Var2.m(h7Var2, null);
                h7Var2.f22855f.freeResources();
                return;
        }
    }
}
