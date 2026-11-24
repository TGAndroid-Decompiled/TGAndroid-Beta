package defpackage;
public final class uv6 implements Runnable {
    public final byte a;
    public final lw6 b;

    public uv6(lw6 lw6Var, byte b) {
        this.a = b;
        this.b = lw6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                lw6Var.m0(new uv6(lw6Var, (byte) 1));
                return;
            default:
                lw6Var.p0();
                return;
        }
    }
}
