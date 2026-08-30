package nh;
public final class q6 implements Runnable {
    public final int f15805a;
    public final s6 f15806b;

    public q6(s6 s6Var, int i10) {
        this.f15805a = i10;
        this.f15806b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f15805a) {
            case 0:
                this.f15806b.e();
                return;
            default:
                this.f15806b.b();
                return;
        }
    }
}
