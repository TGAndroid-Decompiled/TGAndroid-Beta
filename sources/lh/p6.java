package lh;
public final class p6 implements Runnable {
    public final int f16094a;
    public final r6 f16095b;

    public p6(r6 r6Var, int i10) {
        this.f16094a = i10;
        this.f16095b = r6Var;
    }

    @Override
    public final void run() {
        switch (this.f16094a) {
            case 0:
                this.f16095b.e();
                return;
            default:
                this.f16095b.b();
                return;
        }
    }
}
