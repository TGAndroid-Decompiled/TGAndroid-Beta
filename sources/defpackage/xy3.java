package defpackage;

import org.telegram.ui.ActionBar.d;
public final class xy3 implements Runnable {
    public final byte a;
    public final yy3 b;

    public xy3(yy3 yy3Var, byte b) {
        this.a = b;
        this.b = yy3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yy3 yy3Var = this.b;
        switch (b) {
            case 0:
                yy3Var.f.dismiss();
                return;
            default:
                az3 az3Var = yy3Var.f;
                az3Var.dismiss();
                d dVar = az3Var.m1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    mlb.y(null, 2131754432, c41.b0(dVar), null);
                    return;
                }
                return;
        }
    }
}
