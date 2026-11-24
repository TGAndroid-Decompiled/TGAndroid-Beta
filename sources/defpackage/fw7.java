package defpackage;
public final class fw7 implements Runnable {
    public final byte a;
    public final hw7 b;
    public final ry c;

    public fw7(hw7 hw7Var, ry ryVar, byte b) {
        this.a = b;
        this.b = hw7Var;
        this.c = ryVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ry ryVar = this.c;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.p(ryVar, true);
                return;
            default:
                hw7Var.f.f(new fw7(hw7Var, ryVar, (byte) 0));
                return;
        }
    }
}
