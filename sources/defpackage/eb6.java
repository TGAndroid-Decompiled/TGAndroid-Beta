package defpackage;
public final class eb6 implements Runnable {
    public final byte a;
    public final ob6 b;
    public final int c;

    public eb6(ob6 ob6Var, int i, byte b) {
        this.a = b;
        this.b = ob6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ob6 ob6Var = this.b;
        switch (b) {
            case 0:
                ob6Var.P = false;
                ob6Var.j(i);
                return;
            case 1:
                ob6Var.P = false;
                ob6Var.j(i);
                return;
            case 2:
                ob6Var.Z0(i, null, true, null);
                return;
            default:
                ob6Var.Z0(i, null, true, null);
                return;
        }
    }
}
