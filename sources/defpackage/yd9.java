package defpackage;
public final class yd9 implements Runnable {
    public final byte a;
    public final mc9 b;
    public final int c;

    public yd9(mc9 mc9Var, int i, byte b) {
        this.a = b;
        this.b = mc9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                return;
            case 1:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                return;
            case 2:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                return;
            case 3:
                mc9Var.O();
                mc9Var.setSelection(Math.min(i, mc9Var.length()));
                return;
            default:
                mc9Var.O();
                mc9Var.setSelection(Math.max(0, Math.min(i, mc9Var.length())));
                return;
        }
    }
}
