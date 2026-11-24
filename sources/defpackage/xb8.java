package defpackage;
public final class xb8 implements Runnable {
    public final byte a;
    public final bc8 b;

    public xb8(bc8 bc8Var, byte b) {
        this.a = b;
        this.b = bc8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bc8 bc8Var = this.b;
        switch (b) {
            case 0:
                bc8Var.d();
                return;
            default:
                bc8Var.f();
                return;
        }
    }
}
