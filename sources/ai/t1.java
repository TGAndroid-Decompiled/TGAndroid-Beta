package ai;
public final class t1 {
    public final int f1550a;
    public final b2 f1551b;

    public t1(b2 b2Var, int i7) {
        this.f1550a = i7;
        this.f1551b = b2Var;
    }

    public final void a(final float f10) {
        switch (this.f1550a) {
            case 0:
                final b2 b2Var = this.f1551b;
                b2Var.f1139f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b2 b2Var2 = b2Var;
                                if (!b2Var2.f1146j) {
                                    b2Var2.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                b2 b2Var3 = b2Var;
                                if (!b2Var3.f1146j) {
                                    b2Var3.d.h(f10);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final b2 b2Var2 = this.f1551b;
                b2Var2.f1139f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b2 b2Var22 = b2Var2;
                                if (!b2Var22.f1146j) {
                                    b2Var22.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                b2 b2Var3 = b2Var2;
                                if (!b2Var3.f1146j) {
                                    b2Var3.d.h(f10);
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
