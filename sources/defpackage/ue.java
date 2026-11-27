package defpackage;
public final class ue implements Runnable {
    public final byte a;
    public final bf7 b;

    public ue(bf7 bf7Var, byte b) {
        this.a = b;
        this.b = bf7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bf7 bf7Var = this.b;
        switch (b) {
            case 0:
                bf7Var.A(false);
                return;
            case 1:
                bf7Var.A(false);
                return;
            default:
                bf7Var.A(true);
                return;
        }
    }
}
