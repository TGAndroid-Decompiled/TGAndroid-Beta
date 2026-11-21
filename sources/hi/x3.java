package hi;
public final class x3 implements Runnable {
    public final int f15741a;
    public final k5 f15742b;
    public final tg.t1 f15743c;

    public x3(k5 k5Var, tg.t1 t1Var, int i7) {
        this.f15741a = i7;
        this.f15742b = k5Var;
        this.f15743c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f15741a) {
            case 0:
                this.f15742b.A0(this.f15743c, true);
                return;
            default:
                this.f15742b.z0(this.f15743c);
                return;
        }
    }
}
