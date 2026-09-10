package bi;
public final class q5 implements Runnable {
    public final int f3452a;
    public final r7 f3453b;
    public final pg.b2 f3454c;

    public q5(r7 r7Var, pg.b2 b2Var, int i10) {
        this.f3452a = i10;
        this.f3453b = r7Var;
        this.f3454c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f3452a) {
            case 0:
                this.f3453b.D0(this.f3454c, true);
                return;
            default:
                this.f3453b.C0(this.f3454c);
                return;
        }
    }
}
