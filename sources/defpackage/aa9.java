package defpackage;
public final class aa9 implements Runnable {
    public final byte a;
    public final ca9 b;

    public aa9(ca9 ca9Var, byte b) {
        this.a = b;
        this.b = ca9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ca9 ca9Var = this.b;
        switch (b) {
            case 0:
                int i = ca9Var.a;
                da9 da9Var = ca9Var.w;
                if (i == 0) {
                    da9Var.dismiss();
                    return;
                } else {
                    da9Var.onBackPressed();
                    return;
                }
            default:
                gm.E3(ca9Var.n.d);
                return;
        }
    }
}
