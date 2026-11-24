package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ju2 implements Runnable {
    public final byte a;
    public final tu2 b;
    public final TLRPC.User c;

    public ju2(tu2 tu2Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = tu2Var;
        this.c = user;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        TLRPC.User user = this.c;
        tu2 tu2Var = this.b;
        switch (b) {
            case 0:
                if (user != null && tu2Var.N == null && tu2Var.O == null) {
                    if (user.phone == null && (str = tu2Var.M) != null) {
                        user.phone = r58.h(str, false);
                    }
                    tu2Var.b.setText(user.first_name);
                    ru3 ru3Var = tu2Var.b.d;
                    ru3Var.setSelection(ru3Var.length());
                    tu2Var.c.setText(user.last_name);
                }
                TLRPC.UserFull X1 = tu2Var.getMessagesController().X1(tu2Var.I);
                if (X1 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = X1.note;
                    su3 su3Var = tu2Var.d;
                    if (tL_textWithEntities != null) {
                        su3Var.setText(tL_textWithEntities);
                    } else {
                        su3Var.setText("");
                    }
                }
                if (tu2Var.K) {
                    tu2Var.d.d.requestFocus();
                    gm.E3(tu2Var.d.d);
                    return;
                }
                return;
            default:
                tu2Var.d0(user);
                return;
        }
    }
}
