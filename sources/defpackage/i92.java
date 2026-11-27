package defpackage;
public final class i92 implements Runnable {
    public final byte a;
    public final v92 b;

    public i92(v92 v92Var, byte b) {
        this.a = b;
        this.b = v92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v92 v92Var = this.b;
        switch (b) {
            case 0:
                v92Var.d0 = true;
                v92Var.g0();
                return;
            case 1:
                v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(v92Var.a0));
                v92Var.d0();
                return;
            case 2:
                v92Var.f0(false);
                return;
            case 3:
                v92Var.d0 = true;
                if (v92Var.b.length() > 0) {
                    v92Var.b0(v92Var.b.getText().toString());
                }
                v92Var.g0();
                return;
            case 4:
                v92Var.d0();
                return;
            default:
                v92Var.f0(true);
                return;
        }
    }
}
