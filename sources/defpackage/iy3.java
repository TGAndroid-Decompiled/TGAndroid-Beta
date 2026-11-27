package defpackage;

import org.telegram.ui.ActionBar.e;
public final class iy3 implements Runnable {
    public final byte a;
    public final jy3 b;

    public iy3(jy3 jy3Var, byte b) {
        this.a = b;
        this.b = jy3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jy3 jy3Var = this.b;
        switch (b) {
            case 0:
                jy3Var.f.dismiss();
                return;
            default:
                ly3 ly3Var = jy3Var.f;
                ly3Var.dismiss();
                e eVar = ly3Var.m1;
                if (eVar != null && eVar.getParentActivity() != null) {
                    xnb.x(null, 2131754428, d31.b0(eVar), null);
                    return;
                }
                return;
        }
    }
}
