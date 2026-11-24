package defpackage;
public final class kg implements Runnable {
    public final byte a;
    public final ue7 b;

    public kg(ue7 ue7Var, byte b) {
        this.a = b;
        this.b = ue7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ue7 ue7Var = this.b;
        switch (b) {
            case 0:
                ue7Var.z(false);
                return;
            case 1:
                ue7Var.z(false);
                return;
            default:
                ue7Var.z(true);
                return;
        }
    }
}
