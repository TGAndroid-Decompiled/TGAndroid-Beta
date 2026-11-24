package defpackage;

import org.telegram.tgnet.TLRPC;
public final class k82 implements Runnable {
    public final byte a;
    public final p82 b;

    public k82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                p82Var.k0();
                return;
            case 1:
                p82Var.j0();
                return;
            case 2:
                p82Var.b.dismiss();
                p82Var.finishFragment();
                return;
            case 3:
                p82Var.N.setChecked(p82Var.x0.autotranslation);
                return;
            default:
                p82Var.e.setImageDrawable(p82Var.r);
                p82Var.c0.o(2131232052, k96.M0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = p82Var.D0;
                if (user != null) {
                    user.photo = null;
                    p82Var.getMessagesController().a4(p82Var.D0, true, false);
                }
                p82Var.P0 = true;
                if (p82Var.S0 == null) {
                    p82Var.S0 = new oy8(2131623965, gl.L(50.0f), gl.L(50.0f), false, null);
                }
                p82Var.c0.e.setTranslationX(-gl.L(8.0f));
                p82Var.c0.e.setAnimation(p82Var.S0);
                return;
        }
    }
}
