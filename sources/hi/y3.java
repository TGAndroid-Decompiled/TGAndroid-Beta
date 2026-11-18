package hi;
public final class y3 implements Runnable {
    public final int f15763a;
    public final l5 f15764b;
    public final tg.r1 f15765c;

    public y3(l5 l5Var, tg.r1 r1Var, int i7) {
        this.f15763a = i7;
        this.f15764b = l5Var;
        this.f15765c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f15763a) {
            case 0:
                this.f15764b.A0(this.f15765c, true);
                return;
            default:
                this.f15764b.z0(this.f15765c);
                return;
        }
    }
}
