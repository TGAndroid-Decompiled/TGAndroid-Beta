package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f22863a;
    public final i7 f22864b;
    public final h7 f22865c;

    public a7(i7 i7Var, h7 h7Var, int i7) {
        this.f22863a = i7;
        this.f22864b = i7Var;
        this.f22865c = h7Var;
    }

    @Override
    public final void run() {
        switch (this.f22863a) {
            case 0:
                i7 i7Var = this.f22864b;
                i7Var.getClass();
                h7 h7Var = this.f22865c;
                h7Var.f24429l = null;
                i7Var.H0.remove(h7Var);
                h7Var.f24428k = true;
                return;
            default:
                i7 i7Var2 = this.f22864b;
                h7 h7Var2 = this.f22865c;
                i7Var2.m(h7Var2, null);
                h7Var2.f24424f.freeResources();
                return;
        }
    }
}
