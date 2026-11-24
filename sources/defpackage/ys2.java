package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ys2 implements Runnable {
    public final byte a;
    public final it2 b;
    public final TLRPC.User c;

    public ys2(it2 it2Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = it2Var;
        this.c = user;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        TLRPC.User user = this.c;
        it2 it2Var = this.b;
        switch (b) {
            case 0:
                if (user != null && it2Var.N == null && it2Var.O == null) {
                    if (user.phone == null && (str = it2Var.M) != null) {
                        user.phone = p38.h(str, false);
                    }
                    it2Var.b.setText(user.first_name);
                    ht3 ht3Var = it2Var.b.d;
                    ht3Var.setSelection(ht3Var.length());
                    it2Var.c.setText(user.last_name);
                }
                TLRPC.UserFull W1 = it2Var.getMessagesController().W1(it2Var.I);
                if (W1 != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = W1.note;
                    it3 it3Var = it2Var.d;
                    if (tL_textWithEntities != null) {
                        it3Var.setText(tL_textWithEntities);
                    } else {
                        it3Var.setText("");
                    }
                }
                if (it2Var.K) {
                    it2Var.d.d.requestFocus();
                    gl.E3(it2Var.d.d);
                    return;
                }
                return;
            default:
                it2Var.c0(user);
                return;
        }
    }
}
