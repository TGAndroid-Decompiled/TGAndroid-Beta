package defpackage;
public final class r82 implements Runnable {
    public final byte a;
    public final f92 b;

    public r82(f92 f92Var, byte b) {
        this.a = b;
        this.b = f92Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f92 f92Var = this.b;
        switch (b) {
            case 0:
                f92Var.d0 = true;
                f92Var.g0();
                return;
            case 1:
                f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(f92Var.a0));
                f92Var.d0();
                return;
            case 2:
                f92Var.f0(false);
                return;
            case 3:
                f92Var.d0 = true;
                if (f92Var.b.length() > 0) {
                    f92Var.b0(f92Var.b.getText().toString());
                }
                f92Var.g0();
                return;
            case 4:
                f92Var.d0();
                return;
            default:
                f92Var.f0(true);
                return;
        }
    }
}
