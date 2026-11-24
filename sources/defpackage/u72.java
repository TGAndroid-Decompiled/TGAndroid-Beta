package defpackage;
public final class u72 implements Runnable {
    public final byte a;
    public final c82 b;

    public u72(c82 c82Var, byte b) {
        this.a = b;
        this.b = c82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c82 c82Var = this.b;
        switch (b) {
            case 0:
                c82Var.h.requestFocus();
                return;
            case 1:
                c82Var.h.setFocusableInTouchMode(true);
                return;
            case 2:
                c82Var.finishFragment();
                return;
            case 3:
                if (c82Var.Q && !c82Var.P) {
                    c82Var.P = true;
                    kk7.e().k(98, 512);
                    c82Var.c.setVisibility(0);
                    c82Var.c.setLayerType(2, null);
                    c82Var.i0(c82Var.R.e);
                    c82Var.R.a(true, true);
                    return;
                }
                return;
            case 4:
                d01.t(c82Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                d01.t(c82Var.getParentActivity(), k96.M0(2131752397, null));
                return;
            default:
                c82Var.d0(false);
                return;
        }
    }
}
