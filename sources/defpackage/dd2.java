package defpackage;
public final class dd2 implements Runnable {
    public final byte a;
    public final fd2 b;

    public dd2(fd2 fd2Var, byte b) {
        this.a = b;
        this.b = fd2Var;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        byte b;
        byte b2 = this.a;
        fd2 fd2Var = this.b;
        switch (b2) {
            case 0:
                fd2Var.c(true);
                return;
            default:
                fd2Var.e = fd2Var.b();
                byte b3 = fd2Var.f;
                byte b4 = fd2Var.h;
                mu1 mu1Var = fd2Var.a;
                if (fd2Var.b == null) {
                    if (mu1Var.getUserConfig().e() == mu1Var.a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    ?? t09Var = new t09(i, mu1Var.getCurrentAccount(), mu1Var.getResourceProvider(), fd2Var.getContext(), fd2Var.a);
                    t09Var.n1 = 1.0f;
                    t09Var.setWillNotDraw(false);
                    fd2Var.b = t09Var;
                    int L = gl.L(4.0f);
                    if (k96.a0) {
                        b = 0;
                    } else {
                        b = b4;
                    }
                    int i2 = L + b;
                    int L2 = gl.L(4.0f);
                    int L3 = gl.L(4.0f);
                    if (!k96.a0) {
                        b4 = 0;
                    }
                    t09Var.setPadding(i2, L2, L3 + b4, gl.L(b3));
                    fd2Var.b.setDelegate(new qx4(fd2Var));
                    fd2Var.b.setClipChildren(false);
                    fd2Var.b.setClipToPadding(false);
                    fd2Var.addView(fd2Var.b, nme.e(-2, b3 + 70, 5));
                }
                fd2Var.c(false);
                if (fd2Var.b.isEnabled()) {
                    fd2Var.y = true;
                    fd2Var.b.m(fd2Var.e, mu1Var.r8, true);
                    fd2Var.b.p(false);
                    return;
                }
                fd2Var.y = false;
                fd2Var.b.setTransitionProgress(1.0f);
                return;
        }
    }
}
