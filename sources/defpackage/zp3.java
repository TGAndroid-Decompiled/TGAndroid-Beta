package defpackage;
public final class zp3 implements Runnable {
    public final byte a;
    public final fq3 b;

    public zp3(fq3 fq3Var, byte b) {
        this.a = b;
        this.b = fq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                fq3Var.b();
                return;
            case 1:
                fq3Var.e = false;
                cq3 cq3Var = fq3Var.s;
                if (cq3Var != null) {
                    cq3Var.a(true);
                    fq3Var.s = null;
                }
                eq3 eq3Var = fq3Var.n;
                if (eq3Var != null) {
                    eq3Var.a();
                }
                fq3Var.c = false;
                fq3Var.d();
                return;
            default:
                if (fq3Var.c && fq3Var.r != null) {
                    fq3Var.n.b(2131624012, 3500, ob6.N0("VideoConvertFail"));
                    fq3Var.c = false;
                    fq3Var.d();
                    return;
                }
                return;
        }
    }
}
