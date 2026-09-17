package bi;
public final class q8 implements Runnable {
    public final int f3641a;
    public final t8 f3642b;

    public q8(t8 t8Var, int i10) {
        this.f3641a = i10;
        this.f3642b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f3641a) {
            case 0:
                this.f3642b.e();
                return;
            default:
                this.f3642b.b();
                return;
        }
    }
}
