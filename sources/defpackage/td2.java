package defpackage;
public final class td2 implements Runnable {
    public final byte a;
    public final wd2 b;

    public td2(wd2 wd2Var, byte b) {
        this.a = b;
        this.b = wd2Var;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        byte b;
        byte b2 = this.a;
        wd2 wd2Var = this.b;
        switch (b2) {
            case 0:
                wd2Var.c(true);
                return;
            default:
                wd2Var.e = wd2Var.b();
                byte b3 = wd2Var.f;
                byte b4 = wd2Var.h;
                zu1 zu1Var = wd2Var.a;
                if (wd2Var.b == null) {
                    if (zu1Var.getUserConfig().e() == zu1Var.a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    ?? i49Var = new i49(i, zu1Var.getCurrentAccount(), zu1Var.getResourceProvider(), wd2Var.getContext(), wd2Var.a);
                    i49Var.n1 = 1.0f;
                    i49Var.setWillNotDraw(false);
                    wd2Var.b = i49Var;
                    int L = hl.L(4.0f);
                    if (ob6.a0) {
                        b = 0;
                    } else {
                        b = b4;
                    }
                    int i2 = L + b;
                    int L2 = hl.L(4.0f);
                    int L3 = hl.L(4.0f);
                    if (!ob6.a0) {
                        b4 = 0;
                    }
                    i49Var.setPadding(i2, L2, L3 + b4, hl.L(b3));
                    wd2Var.b.setDelegate(new ri6(wd2Var, (byte) 19));
                    wd2Var.b.setClipChildren(false);
                    wd2Var.b.setClipToPadding(false);
                    wd2Var.addView(wd2Var.b, tre.e(-2, b3 + 70, 5));
                }
                wd2Var.c(false);
                if (wd2Var.b.isEnabled()) {
                    wd2Var.y = true;
                    wd2Var.b.m(wd2Var.e, zu1Var.r8, true);
                    wd2Var.b.p(false);
                    return;
                }
                wd2Var.y = false;
                wd2Var.b.setTransitionProgress(1.0f);
                return;
        }
    }
}
