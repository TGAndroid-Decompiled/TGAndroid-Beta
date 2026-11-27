package defpackage;
public final class z6 implements Runnable {
    public final byte a;
    public final s7 b;
    public final int c;

    public z6(s7 s7Var, int i, byte b) {
        this.a = b;
        this.b = s7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    return;
                }
                return;
            default:
                if (s7Var.b.getSwipeBack() != null) {
                    s7Var.b.getSwipeBack().e(i);
                    return;
                }
                return;
        }
    }
}
