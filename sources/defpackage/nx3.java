package defpackage;

import org.telegram.ui.ActionBar.d;
public final class nx3 implements Runnable {
    public final byte a;
    public final ox3 b;

    public nx3(ox3 ox3Var, byte b) {
        this.a = b;
        this.b = ox3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ox3 ox3Var = this.b;
        switch (b) {
            case 0:
                ox3Var.f.dismiss();
                return;
            default:
                qx3 qx3Var = ox3Var.f;
                qx3Var.dismiss();
                d dVar = qx3Var.m1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    yjb.x(null, 2131754432, u21.b0(dVar), null);
                    return;
                }
                return;
        }
    }
}
