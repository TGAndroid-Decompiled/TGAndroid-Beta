package ai;
public final class z5 implements Runnable {
    public final int f1134a;
    public final g6 f1135b;

    public z5(g6 g6Var, int i3) {
        this.f1134a = i3;
        this.f1135b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f1134a) {
            case 0:
                w5 w5Var = this.f1135b.f666c;
                if (!w5Var.f1074j.isEmpty()) {
                    w5Var.f1074j.clear();
                    w5Var.h();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = this.f1135b.f666c;
                if (!w5Var2.f1075k.isEmpty()) {
                    w5Var2.f1075k.clear();
                    w5Var2.h();
                    return;
                }
                return;
            case 2:
                w5 w5Var3 = this.f1135b.f666c;
                if (!w5Var3.f1076l.isEmpty()) {
                    w5Var3.f1076l.clear();
                    w5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f1135b.f666c.i(v5.f1043a);
                return;
            case 4:
                this.f1135b.f666c.i(v5.f1044b);
                return;
            default:
                this.f1135b.f666c.i(v5.f1045c);
                return;
        }
    }
}
