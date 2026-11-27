package defpackage;
public final class o29 implements Runnable {
    public final byte a;
    public final jo0 b;
    public final e29 c;

    public o29(jo0 jo0Var, e29 e29Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = e29Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e29 e29Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new o29(jo0Var, e29Var, (byte) 1));
                return;
            default:
                jo0Var.removeView(e29Var);
                return;
        }
    }
}
