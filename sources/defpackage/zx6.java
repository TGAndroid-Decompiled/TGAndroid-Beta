package defpackage;
public final class zx6 implements Runnable {
    public final byte a;
    public final qy6 b;

    public zx6(qy6 qy6Var, byte b) {
        this.a = b;
        this.b = qy6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                qy6Var.m0(new zx6(qy6Var, (byte) 1));
                return;
            default:
                qy6Var.p0();
                return;
        }
    }
}
