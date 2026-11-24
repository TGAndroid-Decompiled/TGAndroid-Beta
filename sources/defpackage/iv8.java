package defpackage;
public final class iv8 implements Runnable {
    public final byte a = 0;
    public final sv8 b;

    public iv8(sv8 sv8Var) {
        this.b = sv8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sv8 sv8Var = this.b;
        switch (b) {
            case 0:
                sv8Var.e();
                return;
            default:
                sv8Var.e();
                return;
        }
    }
}
