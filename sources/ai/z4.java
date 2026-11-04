package ai;
public final class z4 implements Runnable {
    public final int f1132a;
    public final i6 f1133b;

    public z4(i6 i6Var, int i3) {
        this.f1132a = i3;
        this.f1133b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f1132a) {
            case 0:
                w5 w5Var = this.f1133b.d;
                if (!w5Var.f1076l.isEmpty()) {
                    w5Var.f1076l.clear();
                    w5Var.h();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = this.f1133b.d;
                if (!w5Var2.f1075k.isEmpty()) {
                    w5Var2.f1075k.clear();
                    w5Var2.h();
                    return;
                }
                return;
            case 2:
                w5 w5Var3 = this.f1133b.d;
                if (!w5Var3.f1074j.isEmpty()) {
                    w5Var3.f1074j.clear();
                    w5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f1133b.d.i(v5.f1043a);
                return;
            case 4:
                this.f1133b.d.i(v5.f1044b);
                return;
            default:
                this.f1133b.d.i(v5.f1045c);
                return;
        }
    }
}
