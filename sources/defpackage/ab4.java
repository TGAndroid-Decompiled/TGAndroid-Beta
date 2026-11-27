package defpackage;
public final class ab4 implements Runnable {
    public final byte a;
    public final hb4 b;
    public final gb4 c;

    public ab4(hb4 hb4Var, gb4 gb4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = gb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gb4 gb4Var = this.c;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                hb4Var.k(gb4Var, null);
                gb4Var.f.freeResources();
                return;
            default:
                gb4Var.l = null;
                hb4Var.H0.remove(gb4Var);
                gb4Var.k = true;
                return;
        }
    }
}
