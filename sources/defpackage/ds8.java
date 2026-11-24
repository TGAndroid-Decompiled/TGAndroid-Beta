package defpackage;
public final class ds8 implements Runnable {
    public final byte a;
    public final js8 b;

    public ds8(js8 js8Var, byte b) {
        this.a = b;
        this.b = js8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        js8 js8Var = this.b;
        switch (b) {
            case 0:
                if (!js8Var.T && !js8Var.S) {
                    tk0.c(js8Var.F, js8Var.h);
                    js8Var.G.d();
                    smc smcVar = js8Var.r;
                    ds8 ds8Var = new ds8(js8Var, (byte) 1);
                    mmc mmcVar = smcVar.E;
                    if (mmcVar != null) {
                        if (mmcVar.b != null) {
                            ds8Var.run();
                            return;
                        } else {
                            mmcVar.d = ds8Var;
                            return;
                        }
                    }
                    ds8Var.run();
                    return;
                }
                return;
            default:
                if (!js8Var.T && !js8Var.S) {
                    js8Var.a(1.0f);
                    return;
                }
                return;
        }
    }
}
