package defpackage;
public final class eu8 implements Runnable {
    public final byte a;
    public final ku8 b;

    public eu8(ku8 ku8Var, byte b) {
        this.a = b;
        this.b = ku8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ku8 ku8Var = this.b;
        switch (b) {
            case 0:
                if (!ku8Var.T && !ku8Var.S) {
                    tl0.c(ku8Var.F, ku8Var.h);
                    ku8Var.G.d();
                    soc socVar = ku8Var.r;
                    eu8 eu8Var = new eu8(ku8Var, (byte) 1);
                    moc mocVar = socVar.E;
                    if (mocVar != null) {
                        if (mocVar.b != null) {
                            eu8Var.run();
                            return;
                        } else {
                            mocVar.d = eu8Var;
                            return;
                        }
                    }
                    eu8Var.run();
                    return;
                }
                return;
            default:
                if (!ku8Var.T && !ku8Var.S) {
                    ku8Var.a(1.0f);
                    return;
                }
                return;
        }
    }
}
