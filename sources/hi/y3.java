package hi;
public final class y3 implements Runnable {
    public final int f15760a;
    public final l5 f15761b;
    public final tg.r1 f15762c;

    public y3(l5 l5Var, tg.r1 r1Var, int i7) {
        this.f15760a = i7;
        this.f15761b = l5Var;
        this.f15762c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f15760a) {
            case 0:
                this.f15761b.A0(this.f15762c, true);
                return;
            default:
                this.f15761b.z0(this.f15762c);
                return;
        }
    }
}
