package defpackage;

import org.telegram.ui.ActionBar.e;
public final class xd2 implements Runnable {
    public final byte a;
    public final oe2 b;

    public xd2(oe2 oe2Var, byte b) {
        this.a = b;
        this.b = oe2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oe2 oe2Var = this.b;
        switch (b) {
            case 0:
                oe2Var.q1.f();
                return;
            case 1:
                oe2Var.F0(true);
                return;
            case 2:
                zu1 zu1Var = oe2Var.u1;
                e d0 = w1b.d0(zu1Var.getMessagesController().M0(Long.valueOf(-zu1Var.a())), true);
                ?? obj = new Object();
                obj.a = true;
                d0.setResourceProvider(zu1Var.getResourceProvider());
                obj.c = new kc((byte) 23);
                obj.d = new xd2(oe2Var, (byte) 3);
                obj.b = new xd2(oe2Var, (byte) 4);
                obj.e = true;
                oe2Var.Q1 = d0;
                zu1Var.showAsSheet(d0, obj);
                return;
            case 3:
                oe2Var.J0();
                return;
            case 4:
                oe2Var.Q1 = null;
                return;
            case 5:
                oe2Var.J0();
                return;
            case 6:
                oe2Var.Q1 = null;
                return;
            default:
                oe2Var.N1.c(oe2Var.z1);
                return;
        }
    }
}
