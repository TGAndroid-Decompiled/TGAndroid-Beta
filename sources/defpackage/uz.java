package defpackage;
public final class uz implements Runnable {
    public final byte a;
    public final e00 b;

    public uz(e00 e00Var, byte b) {
        this.a = b;
        this.b = e00Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e00 e00Var = this.b;
        switch (b) {
            case 0:
                e00Var.onBackPressed();
                return;
            default:
                e00Var.a1();
                return;
        }
    }
}
