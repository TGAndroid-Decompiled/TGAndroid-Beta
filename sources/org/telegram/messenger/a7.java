package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22946a;
    public final i7 f22947b;
    public final h7 f22948c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22946a = i7;
        this.f22947b = i7Var;
        this.f22948c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22946a) {
            case 0:
                i7 i7Var = this.f22947b;
                i7Var.getClass();
                h7 h7Var = this.f22948c;
                h7Var.f24499l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24498k = true;
                return;
            default:
                i7 i7Var2 = this.f22947b;
                h7 h7Var2 = this.f22948c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24494f.freeResources();
                return;
        }
    }
}
