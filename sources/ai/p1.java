package ai;
public final class p1 {
    public final int f1475a;
    public final v1 f1476b;

    public p1(v1 v1Var, int i7) {
        this.f1475a = i7;
        this.f1476b = v1Var;
    }

    public final void a(final float f10) {
        switch (this.f1475a) {
            case 0:
                final v1 v1Var = this.f1476b;
                v1Var.f1555e.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v1 v1Var2 = v1Var;
                                if (!v1Var2.h) {
                                    v1Var2.f1554c.h(f10);
                                    return;
                                }
                                return;
                            default:
                                v1 v1Var3 = v1Var;
                                if (!v1Var3.h) {
                                    v1Var3.f1554c.h(f10);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final v1 v1Var2 = this.f1476b;
                v1Var2.f1555e.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v1 v1Var22 = v1Var2;
                                if (!v1Var22.h) {
                                    v1Var22.f1554c.h(f10);
                                    return;
                                }
                                return;
                            default:
                                v1 v1Var3 = v1Var2;
                                if (!v1Var3.h) {
                                    v1Var3.f1554c.h(f10);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
