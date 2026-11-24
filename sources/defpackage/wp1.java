package defpackage;
public final class wp1 implements Runnable {
    public final byte a = 1;
    public final byte b;
    public final yv1 c;
    public final boolean d;

    public wp1(int i, yv1 yv1Var, boolean z) {
        this.b = i;
        this.c = yv1Var;
        this.d = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.d;
        yv1 yv1Var = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                yv1Var.gd(b2, z);
                return;
            default:
                if (b2 != 2) {
                    yv1Var.ja();
                    yv1Var.Dc();
                }
                yp2.f(c41.b0(yv1Var), b2, z);
                return;
        }
    }

    public wp1(yv1 yv1Var, boolean z, int i) {
        this.c = yv1Var;
        this.d = z;
        this.b = i;
    }
}
