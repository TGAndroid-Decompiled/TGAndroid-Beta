package defpackage;
public final class yz4 implements Runnable {
    public final byte a;
    public final oy3 b;
    public final int c;

    public yz4(oy3 oy3Var, int i, byte b) {
        this.a = b;
        this.b = oy3Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        oy3 oy3Var = this.b;
        switch (b) {
            case 0:
                jw6 jw6Var = ((a05) ((pm3) oy3Var.f).d).d;
                if (jw6Var != null) {
                    jw6Var.j(i);
                    return;
                }
                return;
            default:
                jw6 jw6Var2 = ((a05) ((pm3) oy3Var.f).d).d;
                if (jw6Var2 != null) {
                    jw6Var2.k(i);
                    return;
                }
                return;
        }
    }
}
