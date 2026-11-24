package defpackage;

import org.telegram.ui.ActionBar.d;
public final class re2 implements Runnable {
    public final byte a;
    public final if2 b;

    public re2(if2 if2Var, byte b) {
        this.a = b;
        this.b = if2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        if2 if2Var = this.b;
        switch (b) {
            case 0:
                if2Var.q1.f();
                return;
            case 1:
                if2Var.E0(true);
                return;
            case 2:
                yv1 yv1Var = if2Var.u1;
                d e0 = xza.e0(yv1Var.getMessagesController().L0(Long.valueOf(-yv1Var.a())), true);
                ?? obj = new Object();
                obj.a = true;
                e0.setResourceProvider(yv1Var.getResourceProvider());
                obj.c = new jd((byte) 23);
                obj.d = new re2(if2Var, (byte) 3);
                obj.b = new re2(if2Var, (byte) 4);
                obj.e = true;
                if2Var.Q1 = e0;
                yv1Var.showAsSheet(e0, obj);
                return;
            case 3:
                if2Var.I0();
                return;
            case 4:
                if2Var.Q1 = null;
                return;
            case 5:
                if2Var.I0();
                return;
            case 6:
                if2Var.Q1 = null;
                return;
            default:
                if2Var.N1.c(if2Var.z1);
                return;
        }
    }
}
