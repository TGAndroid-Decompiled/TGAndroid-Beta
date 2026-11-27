package defpackage;

import android.view.View;
public final class al4 implements Runnable {
    public final byte a;
    public final cl4 b;

    public al4(cl4 cl4Var, byte b) {
        this.a = b;
        this.b = cl4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cl4 cl4Var = this.b;
        switch (b) {
            case 0:
                View view = cl4Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    bl4 bl4Var = cl4Var.s;
                    bl4Var.getClass();
                    System.currentTimeMillis();
                    bl4Var.c = false;
                    cl4Var.s.a();
                    return;
                }
                return;
            default:
                View view2 = cl4Var.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    bl4 bl4Var2 = cl4Var.s;
                    bl4Var2.b = false;
                    bl4Var2.a();
                    return;
                }
                return;
        }
    }
}
