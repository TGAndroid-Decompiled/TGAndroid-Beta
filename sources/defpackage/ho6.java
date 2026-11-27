package defpackage;
public final class ho6 implements Runnable {
    public final byte a;
    public final jo6 b;
    public final int c;

    public ho6(jo6 jo6Var, int i, byte b) {
        this.a = b;
        this.b = jo6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        jo6 jo6Var = this.b;
        switch (b) {
            case 0:
                try {
                    jo6Var.b.n(i);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    jo6Var.b.n(i);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    jo6Var.b.n(i);
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            default:
                try {
                    jo6Var.b.n(i);
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
        }
    }
}
