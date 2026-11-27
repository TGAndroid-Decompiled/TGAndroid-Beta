package defpackage;
public final class o67 extends bb2 {
    public Runnable W;

    @Override
    public final void N() {
        super.N();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        n67 n67Var = new n67(this, (byte) 0);
        this.W = n67Var;
        hl.c3(n67Var);
    }

    @Override
    public final void V() {
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
            this.W = null;
        }
        if (f11.a) {
            cc4.b("chatItemAnimator disable notifications");
        }
    }

    @Override
    public final void g() {
        super.g();
        Runnable runnable = this.W;
        if (runnable != null) {
            hl.r(runnable);
        }
        n67 n67Var = new n67(this, (byte) 1);
        this.W = n67Var;
        hl.c3(n67Var);
    }

    @Override
    public final void F() {
    }
}
