package defpackage;
public final class ll7 implements Runnable {
    public final byte a;
    public final sl7 b;

    public ll7(sl7 sl7Var, byte b) {
        this.a = b;
        this.b = sl7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sl7 sl7Var = this.b;
        switch (b) {
            case 0:
                hl.t1(sl7Var.l1);
                return;
            default:
                hl.E3(sl7Var.m1.getEditText());
                return;
        }
    }
}
