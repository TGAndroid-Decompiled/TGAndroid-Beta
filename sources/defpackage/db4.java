package defpackage;
public final class db4 implements Runnable {
    public final byte a;
    public final lb4 b;
    public final kb4 c;

    public db4(lb4 lb4Var, kb4 kb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = kb4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kb4 kb4Var = this.c;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                kb4Var.l = null;
                lb4Var.H0.remove(kb4Var);
                kb4Var.k = true;
                return;
            default:
                lb4Var.k(kb4Var, null);
                kb4Var.f.freeResources();
                return;
        }
    }
}
