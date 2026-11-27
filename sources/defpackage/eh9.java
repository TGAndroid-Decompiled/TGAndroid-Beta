package defpackage;
public final class eh9 implements Runnable {
    public final byte a;
    public final pi9 b;
    public final int c;

    public eh9(pi9 pi9Var, int i, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                pi9Var.f4(i);
                return;
            case 1:
                pi9Var.e4(i);
                return;
            case 2:
                pi9Var.g4(i);
                return;
            default:
                pi9Var.scrollBy(0, i);
                return;
        }
    }
}
