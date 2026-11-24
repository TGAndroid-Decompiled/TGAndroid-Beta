package defpackage;

import org.telegram.tgnet.TLRPC;
public final class v92 implements Runnable {
    public final byte a;
    public final ba2 b;

    public v92(ba2 ba2Var, byte b) {
        this.a = b;
        this.b = ba2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ba2 ba2Var = this.b;
        switch (b) {
            case 0:
                ba2Var.l0();
                return;
            case 1:
                ba2Var.k0();
                return;
            case 2:
                ba2Var.b.dismiss();
                ba2Var.finishFragment();
                return;
            case 3:
                ba2Var.N.setChecked(ba2Var.x0.autotranslation);
                return;
            default:
                ba2Var.e.setImageDrawable(ba2Var.r);
                ba2Var.c0.o(2131232053, jb6.M0(2131752149, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ba2Var.D0;
                if (user != null) {
                    user.photo = null;
                    ba2Var.getMessagesController().c4(ba2Var.D0, true, false);
                }
                ba2Var.P0 = true;
                if (ba2Var.S0 == null) {
                    ba2Var.S0 = new p09(2131623965, gm.L(50.0f), gm.L(50.0f), false, null);
                }
                ba2Var.c0.e.setTranslationX(-gm.L(8.0f));
                ba2Var.c0.e.setAnimation(ba2Var.S0);
                return;
        }
    }
}
