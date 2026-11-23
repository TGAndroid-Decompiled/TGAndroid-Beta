package hi;
public final class y3 implements Runnable {
    public final int f15717a;
    public final l5 f15718b;
    public final tg.t1 f15719c;

    public y3(l5 l5Var, tg.t1 t1Var, int i7) {
        this.f15717a = i7;
        this.f15718b = l5Var;
        this.f15719c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f15717a) {
            case 0:
                this.f15718b.A0(this.f15719c, true);
                return;
            default:
                this.f15718b.z0(this.f15719c);
                return;
        }
    }
}
