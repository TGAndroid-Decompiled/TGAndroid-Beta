package defpackage;
public final class ky6 implements Runnable {
    public final byte a;
    public final qy6 b;
    public final og8 c;

    public ky6(qy6 qy6Var, og8 og8Var, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = og8Var;
    }

    @Override
    public final void run() {
        asb asbVar;
        byte b = this.a;
        og8 og8Var = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                qy6Var.p.N(qy6Var.f0(og8Var));
                guc gucVar = qy6Var.l;
                if (og8Var.q().a(17)) {
                    asbVar = og8Var.y0();
                } else {
                    asbVar = asb.a;
                }
                gucVar.D(asbVar);
                return;
            default:
                qy6Var.p.N(qy6Var.f0(og8Var));
                return;
        }
    }
}
