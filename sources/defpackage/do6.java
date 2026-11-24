package defpackage;
public final class do6 implements Runnable {
    public final byte a;
    public final fo6 b;
    public final int c;

    public do6(fo6 fo6Var, int i, byte b) {
        this.a = b;
        this.b = fo6Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                try {
                    fo6Var.b.n(i);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                try {
                    fo6Var.b.n(i);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 2:
                try {
                    fo6Var.b.n(i);
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            default:
                try {
                    fo6Var.b.n(i);
                    return;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
        }
    }
}
