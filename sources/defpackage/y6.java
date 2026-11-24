package defpackage;
public final class y6 implements Runnable {
    public final byte a;
    public final r7 b;
    public final int c;

    public y6(r7 r7Var, int i, byte b) {
        this.a = b;
        this.b = r7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                if (r7Var.b.getSwipeBack() != null) {
                    r7Var.b.getSwipeBack().e(i);
                    return;
                }
                return;
            default:
                if (r7Var.b.getSwipeBack() != null) {
                    r7Var.b.getSwipeBack().e(i);
                    return;
                }
                return;
        }
    }
}
