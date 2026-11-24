package defpackage;

import org.telegram.ui.ActionBar.d;
public final class gd2 implements Runnable {
    public final byte a;
    public final xd2 b;

    public gd2(xd2 xd2Var, byte b) {
        this.a = b;
        this.b = xd2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xd2 xd2Var = this.b;
        switch (b) {
            case 0:
                xd2Var.q1.f();
                return;
            case 1:
                xd2Var.E0(true);
                return;
            case 2:
                mu1 mu1Var = xd2Var.u1;
                d d0 = uxa.d0(mu1Var.getMessagesController().K0(Long.valueOf(-mu1Var.a())), true);
                ?? obj = new Object();
                obj.a = true;
                d0.setResourceProvider(mu1Var.getResourceProvider());
                obj.c = new jc((byte) 23);
                obj.d = new gd2(xd2Var, (byte) 3);
                obj.b = new gd2(xd2Var, (byte) 4);
                obj.e = true;
                xd2Var.Q1 = d0;
                mu1Var.showAsSheet(d0, obj);
                return;
            case 3:
                xd2Var.I0();
                return;
            case 4:
                xd2Var.Q1 = null;
                return;
            case 5:
                xd2Var.I0();
                return;
            case 6:
                xd2Var.Q1 = null;
                return;
            default:
                xd2Var.N1.c(xd2Var.z1);
                return;
        }
    }
}
