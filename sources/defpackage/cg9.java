package defpackage;
public final class cg9 implements Runnable {
    public final byte a;
    public final ne9 b;
    public final int c;

    public cg9(ne9 ne9Var, int i, byte b) {
        this.a = b;
        this.b = ne9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                return;
            case 1:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                return;
            case 2:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                return;
            case 3:
                ne9Var.O();
                ne9Var.setSelection(Math.min(i, ne9Var.length()));
                return;
            default:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                return;
        }
    }
}
