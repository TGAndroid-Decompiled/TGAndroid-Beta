package defpackage;

import android.view.View;
public final class wi4 implements Runnable {
    public final byte a;
    public final yi4 b;

    public wi4(yi4 yi4Var, byte b) {
        this.a = b;
        this.b = yi4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yi4 yi4Var = this.b;
        switch (b) {
            case 0:
                View view = yi4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    xi4 xi4Var = yi4Var.s;
                    xi4Var.getClass();
                    System.currentTimeMillis();
                    xi4Var.c = false;
                    yi4Var.s.a();
                    return;
                }
                return;
            default:
                View view2 = yi4Var.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    xi4 xi4Var2 = yi4Var.s;
                    xi4Var2.b = false;
                    xi4Var2.a();
                    return;
                }
                return;
        }
    }
}
