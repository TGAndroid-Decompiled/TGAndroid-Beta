package defpackage;
public final class ym5 implements Runnable {
    public final byte a;
    public final an5 b;
    public final Boolean c;

    public ym5(an5 an5Var, Boolean bool, byte b) {
        this.a = b;
        this.b = an5Var;
        this.c = bool;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Boolean bool = this.c;
        an5 an5Var = this.b;
        switch (b) {
            case 0:
                an5Var.h.u.remove(an5Var.a.e);
                gm.c3(new ym5(an5Var, bool, (byte) 1));
                return;
            default:
                boolean booleanValue = bool.booleanValue();
                tm5 tm5Var = an5Var.a;
                if (booleanValue) {
                    nm7.f(tm5Var.o).k(143, tm5Var.e, tm5Var.p);
                    return;
                } else {
                    nm7.f(tm5Var.o).k(144, tm5Var.e, 2);
                    return;
                }
        }
    }
}
