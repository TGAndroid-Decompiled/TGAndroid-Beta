package defpackage;

import android.view.View;
public final class imc implements Runnable {
    public final byte a;
    public final mmc b;

    public imc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                cm1 cm1Var = mmcVar.a;
                if (cm1Var.getParent() instanceof View) {
                    ((View) cm1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                mmcVar.p();
                return;
        }
    }
}
