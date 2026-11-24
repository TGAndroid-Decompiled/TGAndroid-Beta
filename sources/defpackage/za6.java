package defpackage;
public final class za6 implements Runnable {
    public final byte a;
    public final jb6 b;
    public final int c;

    public za6(jb6 jb6Var, int i, byte b) {
        this.a = b;
        this.b = jb6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        jb6 jb6Var = this.b;
        switch (b) {
            case 0:
                jb6Var.P = false;
                jb6Var.j(i);
                return;
            case 1:
                jb6Var.P = false;
                jb6Var.j(i);
                return;
            case 2:
                jb6Var.Z0(i, null, true, null);
                return;
            default:
                jb6Var.Z0(i, null, true, null);
                return;
        }
    }
}
