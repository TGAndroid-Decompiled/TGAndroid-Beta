package nh;
public final class q6 implements Runnable {
    public final int f15785a;
    public final s6 f15786b;

    public q6(s6 s6Var, int i10) {
        this.f15785a = i10;
        this.f15786b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f15785a) {
            case 0:
                this.f15786b.e();
                return;
            default:
                this.f15786b.b();
                return;
        }
    }
}
