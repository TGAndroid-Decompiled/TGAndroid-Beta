package hi;
public final class x3 implements Runnable {
    public final int f15744a;
    public final k5 f15745b;
    public final tg.t1 f15746c;

    public x3(k5 k5Var, tg.t1 t1Var, int i7) {
        this.f15744a = i7;
        this.f15745b = k5Var;
        this.f15746c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f15744a) {
            case 0:
                this.f15745b.A0(this.f15746c, true);
                return;
            default:
                this.f15745b.z0(this.f15746c);
                return;
        }
    }
}
