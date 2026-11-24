package defpackage;
public final class wt8 implements Runnable {
    public final byte a;
    public final yt8 b;
    public final int c;

    public wt8(yt8 yt8Var, int i, byte b) {
        this.a = b;
        this.b = yt8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        yt8 yt8Var = this.b;
        switch (b) {
            case 0:
                yt8Var.b.e(i, yt8Var.d.i(i));
                return;
            default:
                yt8Var.b.e(i, yt8Var.d.i(i));
                return;
        }
    }
}
