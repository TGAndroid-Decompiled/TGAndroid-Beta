package bi;
public final class y7 implements Runnable {
    public final int f4252a;
    public final f8 f4253b;

    public y7(f8 f8Var, int i7) {
        this.f4252a = i7;
        this.f4253b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f4252a) {
            case 0:
                this.f4253b.e1();
                return;
            default:
                f8 f8Var = this.f4253b;
                f8Var.f3586e2.O(true);
                org.telegram.messenger.g0.h3(new y7(f8Var, 0), 150L);
                return;
        }
    }
}
