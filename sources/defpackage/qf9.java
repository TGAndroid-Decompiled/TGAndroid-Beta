package defpackage;
public final class qf9 implements Runnable {
    public final byte a;
    public final ch9 b;
    public final int c;

    public qf9(ch9 ch9Var, int i, byte b) {
        this.a = b;
        this.b = ch9Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ch9 ch9Var = this.b;
        switch (b) {
            case 0:
                ch9Var.d4(i);
                return;
            case 1:
                ch9Var.f4(i);
                return;
            case 2:
                ch9Var.scrollBy(0, i);
                return;
            default:
                ch9Var.e4(i);
                return;
        }
    }
}
