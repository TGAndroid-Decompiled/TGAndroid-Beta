package defpackage;
public final class c19 implements Runnable {
    public final byte a;
    public final jp0 b;
    public final s09 c;

    public c19(jp0 jp0Var, s09 s09Var, byte b) {
        this.a = b;
        this.b = jp0Var;
        this.c = s09Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s09 s09Var = this.c;
        jp0 jp0Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new c19(jp0Var, s09Var, (byte) 1));
                return;
            default:
                jp0Var.removeView(s09Var);
                return;
        }
    }
}
