package defpackage;
public final class mh0 implements Runnable {
    public final byte a;
    public final oh0 b;

    public mh0(oh0 oh0Var, byte b) {
        this.a = b;
        this.b = oh0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oh0 oh0Var = this.b;
        switch (b) {
            case 0:
                oh0Var.a(null, false);
                return;
            default:
                oh0Var.b(true);
                return;
        }
    }
}
