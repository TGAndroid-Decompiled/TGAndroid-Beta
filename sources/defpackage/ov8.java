package defpackage;
public final class ov8 implements Runnable {
    public final byte a;
    public final sv8 b;

    public ov8(sv8 sv8Var, byte b) {
        this.a = b;
        this.b = sv8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sv8 sv8Var = this.b;
        switch (b) {
            case 0:
                if (!sv8Var.T && !sv8Var.S) {
                    sv8Var.a(1.0f);
                    return;
                }
                return;
            default:
                if (!sv8Var.T && !sv8Var.S) {
                    uk0.c(sv8Var.F, sv8Var.h);
                    sv8Var.G.d();
                    frc frcVar = sv8Var.r;
                    ov8 ov8Var = new ov8(sv8Var, (byte) 0);
                    zqc zqcVar = frcVar.E;
                    if (zqcVar != null) {
                        if (zqcVar.b != null) {
                            ov8Var.run();
                            return;
                        } else {
                            zqcVar.d = ov8Var;
                            return;
                        }
                    }
                    ov8Var.run();
                    return;
                }
                return;
        }
    }
}
