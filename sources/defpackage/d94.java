package defpackage;
public final class d94 implements Runnable {
    public final byte a;
    public final l94 b;
    public final k94 c;

    public d94(l94 l94Var, k94 k94Var, byte b) {
        this.a = b;
        this.b = l94Var;
        this.c = k94Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k94 k94Var = this.c;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                k94Var.l = null;
                l94Var.H0.remove(k94Var);
                k94Var.k = true;
                return;
            default:
                l94Var.k(k94Var, null);
                k94Var.f.freeResources();
                return;
        }
    }
}
