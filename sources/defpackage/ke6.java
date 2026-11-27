package defpackage;
public final class ke6 implements fd {
    public final byte a;
    public final qh6 b;

    public ke6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.b[qh6Var.a].d();
                qh6Var.y1(true, true);
                return;
            default:
                qh6Var.m0 = true;
                if (qh6Var.a != 0) {
                    qh6Var.J1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
