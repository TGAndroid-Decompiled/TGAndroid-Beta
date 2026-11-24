package defpackage;

import android.view.View;
public final class gmc implements it3 {
    public final byte a;
    public final mmc b;

    public gmc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                mmcVar.C = f;
                mmcVar.a.invalidate();
                return;
            case 1:
                mmcVar.c0 = f;
                cm1 cm1Var = mmcVar.a;
                cm1Var.invalidate();
                if (cm1Var.getParent() instanceof View) {
                    ((View) cm1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                mmcVar.a0 = f;
                cm1 cm1Var2 = mmcVar.a;
                cm1Var2.invalidate();
                if (cm1Var2.getParent() instanceof View) {
                    ((View) cm1Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
