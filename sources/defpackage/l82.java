package defpackage;
public final class l82 implements Runnable {
    public final byte a;
    public final t82 b;

    public l82(t82 t82Var, byte b) {
        this.a = b;
        this.b = t82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t82 t82Var = this.b;
        switch (b) {
            case 0:
                t82Var.h.requestFocus();
                return;
            case 1:
                t82Var.h.setFocusableInTouchMode(true);
                return;
            case 2:
                t82Var.finishFragment();
                return;
            case 3:
                if (t82Var.Q && !t82Var.P) {
                    t82Var.P = true;
                    jn7.e().k(99, 512);
                    t82Var.c.setVisibility(0);
                    t82Var.c.setLayerType(2, null);
                    t82Var.i0(t82Var.R.e);
                    t82Var.R.a(true, true);
                    return;
                }
                return;
            case 4:
                m01.u(t82Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                m01.u(t82Var.getParentActivity(), ob6.M0(2131752381, null));
                return;
            default:
                t82Var.d0(false);
                return;
        }
    }
}
