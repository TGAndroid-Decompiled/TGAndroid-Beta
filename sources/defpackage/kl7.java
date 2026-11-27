package defpackage;
public final class kl7 implements Runnable {
    public final byte a;
    public final rl7 b;

    public kl7(rl7 rl7Var, byte b) {
        this.a = b;
        this.b = rl7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rl7 rl7Var = this.b;
        switch (b) {
            case 0:
                hl.t1(rl7Var.l1);
                return;
            default:
                hl.E3(rl7Var.m1.getEditText());
                return;
        }
    }
}
