package defpackage;
public final class tq3 implements Runnable {
    public final byte a;
    public final vq3 b;
    public final wq3 c;

    public tq3(vq3 vq3Var, wq3 wq3Var, byte b) {
        this.a = b;
        this.b = vq3Var;
        this.c = wq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wq3 wq3Var = this.c;
        vq3 vq3Var = this.b;
        switch (b) {
            case 0:
                wq3Var.I(vq3Var.a, vq3Var.b);
                return;
            default:
                wq3Var.y(vq3Var.a, vq3Var.b);
                return;
        }
    }
}
