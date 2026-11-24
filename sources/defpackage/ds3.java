package defpackage;
public final class ds3 implements Runnable {
    public final byte a;
    public final fs3 b;
    public final gs3 c;

    public ds3(fs3 fs3Var, gs3 gs3Var, byte b) {
        this.a = b;
        this.b = fs3Var;
        this.c = gs3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gs3 gs3Var = this.c;
        fs3 fs3Var = this.b;
        switch (b) {
            case 0:
                gs3Var.I(fs3Var.a, fs3Var.b);
                return;
            default:
                gs3Var.y(fs3Var.a, fs3Var.b);
                return;
        }
    }
}
