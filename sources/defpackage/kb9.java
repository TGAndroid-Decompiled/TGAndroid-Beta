package defpackage;
public final class kb9 implements Runnable {
    public final byte a;
    public final mb9 b;

    public kb9(mb9 mb9Var, byte b) {
        this.a = b;
        this.b = mb9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mb9 mb9Var = this.b;
        switch (b) {
            case 0:
                int i = mb9Var.a;
                nb9 nb9Var = mb9Var.w;
                if (i == 0) {
                    nb9Var.dismiss();
                    return;
                } else {
                    nb9Var.onBackPressed();
                    return;
                }
            default:
                hl.E3(mb9Var.n.d);
                return;
        }
    }
}
