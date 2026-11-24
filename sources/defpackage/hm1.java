package defpackage;
public final class hm1 implements Runnable {
    public final byte a;
    public final vs9 b;

    public hm1(vs9 vs9Var, byte b) {
        this.a = b;
        this.b = vs9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vs9 vs9Var = this.b;
        switch (b) {
            case 0:
                if (!vs9Var.N) {
                    vs9Var.N = true;
                    vs9Var.a(new hm1(vs9Var, (byte) 2), false);
                    vs9Var.s.invalidate();
                    return;
                }
                return;
            case 1:
                vs9Var.dismiss();
                return;
            case 2:
                vs9Var.getClass();
                gm.c3(new hm1(vs9Var, (byte) 4));
                return;
            case 3:
                gm.c3(new hm1(vs9Var, (byte) 5));
                return;
            case 4:
                vs9Var.c();
                return;
            default:
                vs9Var.b();
                return;
        }
    }
}
