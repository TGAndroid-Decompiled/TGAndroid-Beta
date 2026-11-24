package defpackage;
public final class vg6 implements Runnable {
    public final byte a;
    public final sk3 b;

    public vg6(sk3 sk3Var, byte b) {
        this.a = b;
        this.b = sk3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sk3 sk3Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new vg6(sk3Var, (byte) 1));
                return;
            default:
                sk3Var.a("CANCELLED");
                return;
        }
    }
}
