package defpackage;

import org.telegram.tgnet.TLRPC;
public final class st2 implements Runnable {
    public final byte a;
    public final cu2 b;
    public final TLRPC.User c;

    public st2(cu2 cu2Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = cu2Var;
        this.c = user;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        TLRPC.User user = this.c;
        cu2 cu2Var = this.b;
        switch (b) {
            case 0:
                if (user != null && cu2Var.N == null && cu2Var.O == null) {
                    if (user.phone == null && (str = cu2Var.M) != null) {
                        user.phone = f78.h(str, false);
                    }
                    cu2Var.b.setText(user.first_name);
                    yt3 yt3Var = cu2Var.b.d;
                    yt3Var.setSelection(yt3Var.length());
                    cu2Var.c.setText(user.last_name);
                }
                TLRPC.UserFull Y1 = cu2Var.getMessagesController().Y1(cu2Var.I);
                if (Y1 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = Y1.note;
                    zt3 zt3Var = cu2Var.d;
                    if (tL_textWithEntities != null) {
                        zt3Var.setText(tL_textWithEntities);
                    } else {
                        zt3Var.setText("");
                    }
                }
                if (cu2Var.K) {
                    cu2Var.d.d.requestFocus();
                    hl.E3(cu2Var.d.d);
                    return;
                }
                return;
            default:
                cu2Var.c0(user);
                return;
        }
    }
}
