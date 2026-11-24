package defpackage;
public final class qn1 implements Runnable {
    public final byte a;
    public final py b;

    public qn1(py pyVar, byte b) {
        this.a = b;
        this.b = pyVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        py pyVar = this.b;
        switch (b) {
            case 0:
                gl.E3(pyVar);
                return;
            default:
                jd8 jd8Var = (jd8) pyVar.f2;
                gb2 gb2Var = jd8Var.n;
                if (gb2Var != null && gb2Var.getDelegate() != null) {
                    jd8Var.n.getDelegate().C1(jd8Var.n, false);
                    return;
                }
                return;
        }
    }
}
