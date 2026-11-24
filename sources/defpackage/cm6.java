package defpackage;
public final class cm6 implements Runnable {
    public final byte a;
    public final em6 b;
    public final int c;

    public cm6(em6 em6Var, int i, byte b) {
        this.a = b;
        this.b = em6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        em6 em6Var = this.b;
        switch (b) {
            case 0:
                try {
                    em6Var.b.n(i);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                try {
                    em6Var.b.n(i);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    em6Var.b.n(i);
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            default:
                try {
                    em6Var.b.n(i);
                    return;
                } catch (Exception e4) {
                    fa4.g(e4, true);
                    return;
                }
        }
    }
}
