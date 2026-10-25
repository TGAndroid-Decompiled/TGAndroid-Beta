package di;
public final class e7 implements Runnable {
    public final int f8524a;
    public final g7 f8525b;

    public e7(g7 g7Var, int i10) {
        this.f8524a = i10;
        this.f8525b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f8524a) {
            case 0:
                this.f8525b.e();
                return;
            default:
                this.f8525b.b();
                return;
        }
    }
}
