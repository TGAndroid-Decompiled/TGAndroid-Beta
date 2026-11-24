package defpackage;
public final class jya implements Runnable {
    public final byte a;
    public final cv8 b;

    public jya(cv8 cv8Var, byte b) {
        this.a = b;
        this.b = cv8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cv8 cv8Var = this.b;
        switch (b) {
            case 0:
                cv8Var.b();
                return;
            default:
                cv8Var.b();
                return;
        }
    }
}
