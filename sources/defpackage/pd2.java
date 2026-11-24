package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pd2 implements pmb {
    public final byte a;
    public final qd2 b;

    public pd2(qd2 qd2Var, byte b) {
        this.a = b;
        this.b = qd2Var;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        qd2 qd2Var = this.b;
        switch (b) {
            case 0:
                xd2 xd2Var = qd2Var.a;
                xd2Var.R1.I();
                xd2Var.dismiss();
                return;
            default:
                xd2 xd2Var2 = qd2Var.a;
                xd2Var2.R1.I();
                xd2Var2.dismiss();
                return;
        }
    }
}
