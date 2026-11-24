package defpackage;
public final class fl7 implements Runnable {
    public final byte a;
    public final ml7 b;

    public fl7(ml7 ml7Var, byte b) {
        this.a = b;
        this.b = ml7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ml7 ml7Var = this.b;
        switch (b) {
            case 0:
                gm.t1(ml7Var.l1);
                return;
            default:
                gm.E3(ml7Var.m1.getEditText());
                return;
        }
    }
}
