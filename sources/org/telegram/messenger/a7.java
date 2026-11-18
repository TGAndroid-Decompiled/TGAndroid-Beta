package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22835a;
    public final i7 f22836b;
    public final h7 f22837c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22835a = i7;
        this.f22836b = i7Var;
        this.f22837c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22835a) {
            case 0:
                i7 i7Var = this.f22836b;
                i7Var.getClass();
                h7 h7Var = this.f22837c;
                h7Var.f24401l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24400k = true;
                return;
            default:
                i7 i7Var2 = this.f22836b;
                h7 h7Var2 = this.f22837c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24396f.freeResources();
                return;
        }
    }
}
