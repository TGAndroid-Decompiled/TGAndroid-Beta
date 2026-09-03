package oh;
public final class q6 implements Runnable {
    public final int f17662a;
    public final s6 f17663b;

    public q6(s6 s6Var, int i10) {
        this.f17662a = i10;
        this.f17663b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f17662a) {
            case 0:
                this.f17663b.e();
                return;
            default:
                this.f17663b.b();
                return;
        }
    }
}
