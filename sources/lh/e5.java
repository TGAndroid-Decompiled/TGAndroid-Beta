package lh;
public final class e5 implements Runnable {
    public final int f12696a;
    public final p5 f12697b;

    public e5(p5 p5Var, int i10) {
        this.f12696a = i10;
        this.f12697b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f12696a) {
            case 0:
                b5 b5Var = this.f12697b.f12896c;
                if (!b5Var.f12625j.isEmpty()) {
                    b5Var.f12625j.clear();
                    b5Var.h();
                    return;
                }
                return;
            case 1:
                b5 b5Var2 = this.f12697b.f12896c;
                if (!b5Var2.f12626k.isEmpty()) {
                    b5Var2.f12626k.clear();
                    b5Var2.h();
                    return;
                }
                return;
            case 2:
                b5 b5Var3 = this.f12697b.f12896c;
                if (!b5Var3.f12627l.isEmpty()) {
                    b5Var3.f12627l.clear();
                    b5Var3.h();
                    return;
                }
                return;
            case 3:
                this.f12697b.f12896c.i(a5.BY_PRICE);
                return;
            case 4:
                this.f12697b.f12896c.i(a5.BY_DATE);
                return;
            default:
                this.f12697b.f12896c.i(a5.BY_NUMBER);
                return;
        }
    }
}
