package ai;
public final class w1 {
    public final int f1590a;
    public final e2 f1591b;

    public w1(e2 e2Var, int i7) {
        this.f1590a = i7;
        this.f1591b = e2Var;
    }

    public final void a(final float f10) {
        switch (this.f1590a) {
            case 0:
                final e2 e2Var = this.f1591b;
                e2Var.f1171f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e2 e2Var2 = e2Var;
                                if (!e2Var2.f1178j) {
                                    e2Var2.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                e2 e2Var3 = e2Var;
                                if (!e2Var3.f1178j) {
                                    e2Var3.d.h(f10);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final e2 e2Var2 = this.f1591b;
                e2Var2.f1171f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e2 e2Var22 = e2Var2;
                                if (!e2Var22.f1178j) {
                                    e2Var22.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                e2 e2Var3 = e2Var2;
                                if (!e2Var3.f1178j) {
                                    e2Var3.d.h(f10);
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
