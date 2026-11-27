package defpackage;
public final class cb6 implements Runnable {
    public final byte a;
    public final ls5 b;
    public final lb6 c;

    public cb6(ls5 ls5Var, lb6 lb6Var, byte b) {
        this.a = b;
        this.b = ls5Var;
        this.c = lb6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lb6 lb6Var = this.c;
        ls5 ls5Var = this.b;
        switch (b) {
            case 0:
                ls5Var.run();
                lb6Var.a();
                return;
            default:
                ls5Var.run();
                lb6Var.a();
                return;
        }
    }
}
