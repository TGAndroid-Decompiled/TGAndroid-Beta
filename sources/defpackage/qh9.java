package defpackage;
public final class qh9 implements Runnable {
    public final byte a;
    public final dg9 b;
    public final int c;

    public qh9(dg9 dg9Var, int i, byte b) {
        this.a = b;
        this.b = dg9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        dg9 dg9Var = this.b;
        switch (b) {
            case 0:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                return;
            case 1:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                return;
            case 2:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                return;
            case 3:
                dg9Var.O();
                dg9Var.setSelection(Math.min(i, dg9Var.length()));
                return;
            default:
                dg9Var.O();
                dg9Var.setSelection(Math.max(0, Math.min(i, dg9Var.length())));
                return;
        }
    }
}
