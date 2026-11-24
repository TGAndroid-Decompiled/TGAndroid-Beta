package defpackage;
public final class hi4 implements Runnable {
    public final byte a;
    public final mi4 b;
    public final ae9 c;

    public hi4(mi4 mi4Var, ae9 ae9Var, byte b) {
        this.a = b;
        this.b = mi4Var;
        this.c = ae9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ae9 ae9Var = this.c;
        mi4 mi4Var = this.b;
        mi4Var.getClass();
        switch (b) {
            case 0:
                gl.d3(new hi4(mi4Var, ae9Var, (byte) 1), 320L);
                return;
            default:
                ae9Var.a(new hj3(mi4Var, (byte) 9));
                return;
        }
    }
}
