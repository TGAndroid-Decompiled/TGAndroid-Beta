package ai;
public final class u1 {
    public final int f1559a;
    public final c2 f1560b;

    public u1(c2 c2Var, int i7) {
        this.f1559a = i7;
        this.f1560b = c2Var;
    }

    public final void a(final float f10) {
        switch (this.f1559a) {
            case 0:
                final c2 c2Var = this.f1560b;
                c2Var.f1146f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c2 c2Var2 = c2Var;
                                if (!c2Var2.f1153j) {
                                    c2Var2.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                c2 c2Var3 = c2Var;
                                if (!c2Var3.f1153j) {
                                    c2Var3.d.h(f10);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final c2 c2Var2 = this.f1560b;
                c2Var2.f1146f.post(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c2 c2Var22 = c2Var2;
                                if (!c2Var22.f1153j) {
                                    c2Var22.d.h(f10);
                                    return;
                                }
                                return;
                            default:
                                c2 c2Var3 = c2Var2;
                                if (!c2Var3.f1153j) {
                                    c2Var3.d.h(f10);
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
