package defpackage;
public final class f92 implements Runnable {
    public final byte a;
    public final n92 b;

    public f92(n92 n92Var, byte b) {
        this.a = b;
        this.b = n92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n92 n92Var = this.b;
        switch (b) {
            case 0:
                n92Var.h.requestFocus();
                return;
            case 1:
                n92Var.h.setFocusableInTouchMode(true);
                return;
            case 2:
                n92Var.finishFragment();
                return;
            case 3:
                if (n92Var.Q && !n92Var.P) {
                    n92Var.P = true;
                    nm7.e().k(99, 512);
                    n92Var.c.setVisibility(0);
                    n92Var.c.setLayerType(2, null);
                    n92Var.j0(n92Var.R.e);
                    n92Var.R.a(true, true);
                    return;
                }
                return;
            case 4:
                l11.u(n92Var.getParentActivity(), "https://t.me/stickers");
                return;
            case 5:
                l11.u(n92Var.getParentActivity(), jb6.M0(2131752353, null));
                return;
            default:
                n92Var.e0(false);
                return;
        }
    }
}
