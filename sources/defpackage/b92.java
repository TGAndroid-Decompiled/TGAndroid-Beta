package defpackage;

import org.telegram.tgnet.TLRPC;
public final class b92 implements Runnable {
    public final byte a;
    public final g92 b;

    public b92(g92 g92Var, byte b) {
        this.a = b;
        this.b = g92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g92 g92Var = this.b;
        switch (b) {
            case 0:
                g92Var.k0();
                return;
            case 1:
                g92Var.j0();
                return;
            case 2:
                g92Var.b.dismiss();
                g92Var.finishFragment();
                return;
            case 3:
                g92Var.N.setChecked(g92Var.x0.autotranslation);
                return;
            default:
                g92Var.e.setImageDrawable(g92Var.r);
                g92Var.c0.o(2131232052, ob6.M0(2131752177, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = g92Var.D0;
                if (user != null) {
                    user.photo = null;
                    g92Var.getMessagesController().i4(g92Var.D0, true, false);
                }
                g92Var.P0 = true;
                if (g92Var.S0 == null) {
                    g92Var.S0 = new b29(2131623965, hl.L(50.0f), hl.L(50.0f), false, null);
                }
                g92Var.c0.e.setTranslationX(-hl.L(8.0f));
                g92Var.c0.e.setAnimation(g92Var.S0);
                return;
        }
    }
}
