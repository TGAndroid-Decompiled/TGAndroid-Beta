package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22842a;
    public final i7 f22843b;
    public final h7 f22844c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22842a = i7;
        this.f22843b = i7Var;
        this.f22844c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22842a) {
            case 0:
                i7 i7Var = this.f22843b;
                i7Var.getClass();
                h7 h7Var = this.f22844c;
                h7Var.f24376l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24375k = true;
                return;
            default:
                i7 i7Var2 = this.f22843b;
                h7 h7Var2 = this.f22844c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24371f.freeResources();
                return;
        }
    }
}
