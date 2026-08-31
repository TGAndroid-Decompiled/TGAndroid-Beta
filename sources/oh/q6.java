package oh;
public final class q6 implements Runnable {
    public final int f17660a;
    public final s6 f17661b;

    public q6(s6 s6Var, int i10) {
        this.f17660a = i10;
        this.f17661b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f17660a) {
            case 0:
                this.f17661b.e();
                return;
            default:
                this.f17661b.b();
                return;
        }
    }
}
