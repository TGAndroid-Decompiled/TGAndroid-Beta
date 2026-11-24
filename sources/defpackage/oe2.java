package defpackage;
public final class oe2 implements Runnable {
    public final byte a;
    public final qe2 b;

    public oe2(qe2 qe2Var, byte b) {
        this.a = b;
        this.b = qe2Var;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        byte b;
        byte b2 = this.a;
        qe2 qe2Var = this.b;
        switch (b2) {
            case 0:
                qe2Var.c(true);
                return;
            default:
                qe2Var.e = qe2Var.b();
                byte b3 = qe2Var.f;
                byte b4 = qe2Var.h;
                yv1 yv1Var = qe2Var.a;
                if (qe2Var.b == null) {
                    if (yv1Var.getUserConfig().e() == yv1Var.a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    ?? v29Var = new v29(i, yv1Var.getCurrentAccount(), yv1Var.getResourceProvider(), qe2Var.getContext(), qe2Var.a);
                    v29Var.n1 = 1.0f;
                    v29Var.setWillNotDraw(false);
                    qe2Var.b = v29Var;
                    int L = gm.L(4.0f);
                    if (jb6.a0) {
                        b = 0;
                    } else {
                        b = b4;
                    }
                    int i2 = L + b;
                    int L2 = gm.L(4.0f);
                    int L3 = gm.L(4.0f);
                    if (!jb6.a0) {
                        b4 = 0;
                    }
                    v29Var.setPadding(i2, L2, L3 + b4, gm.L(b3));
                    qe2Var.b.setDelegate(new ni6(qe2Var, (byte) 19));
                    qe2Var.b.setClipChildren(false);
                    qe2Var.b.setClipToPadding(false);
                    qe2Var.addView(qe2Var.b, qoe.e(-2, b3 + 70, 5));
                }
                qe2Var.c(false);
                if (qe2Var.b.isEnabled()) {
                    qe2Var.y = true;
                    qe2Var.b.m(qe2Var.e, yv1Var.r8, true);
                    qe2Var.b.p(false);
                    return;
                }
                qe2Var.y = false;
                qe2Var.b.setTransitionProgress(1.0f);
                return;
        }
    }
}
