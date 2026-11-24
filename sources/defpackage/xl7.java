package defpackage;
public final class xl7 implements Runnable {
    public final byte a;
    public final im7 b;
    public final long c;
    public final long d;

    public xl7(im7 im7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                im7Var.G = j2;
                im7Var.H = j;
                return;
            default:
                im7Var.i(j2, j);
                return;
        }
    }
}
