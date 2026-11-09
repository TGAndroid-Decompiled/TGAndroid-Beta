package di;
public final class w6 implements Runnable {
    public final int f9899a;
    public final y6 f9900b;

    public w6(y6 y6Var, int i7) {
        this.f9899a = i7;
        this.f9900b = y6Var;
    }

    @Override
    public final void run() {
        switch (this.f9899a) {
            case 0:
                this.f9900b.e();
                return;
            default:
                this.f9900b.b();
                return;
        }
    }
}
