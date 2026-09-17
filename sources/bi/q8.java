package bi;
public final class q8 implements Runnable {
    public final int f3614a;
    public final t8 f3615b;

    public q8(t8 t8Var, int i10) {
        this.f3614a = i10;
        this.f3615b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f3614a) {
            case 0:
                this.f3615b.e();
                return;
            default:
                this.f3615b.b();
                return;
        }
    }
}
