package defpackage;
public final class u37 implements Runnable {
    public final byte a;
    public final j47 b;

    public u37(j47 j47Var, byte b) {
        this.a = b;
        this.b = j47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                j47Var.l();
                return;
            case 1:
                j47Var.getClass();
                pla.f(false);
                pla plaVar = j47Var.i0;
                if (plaVar != null) {
                    plaVar.b(j47Var.F);
                }
                gl.c3(new u37(j47Var, (byte) 0));
                return;
            case 2:
                pla.f(false);
                pla plaVar2 = j47Var.i0;
                if (plaVar2 != null) {
                    plaVar2.b(j47Var.F);
                }
                gl.c3(new u37(j47Var, (byte) 3));
                return;
            default:
                j47Var.k();
                return;
        }
    }
}
