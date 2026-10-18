package ei;
public final class m4 implements Runnable {
    public final int f9463a;
    public final f6 f9464b;
    public final rg.b2 f9465c;

    public m4(f6 f6Var, rg.b2 b2Var, int i10) {
        this.f9463a = i10;
        this.f9464b = f6Var;
        this.f9465c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9463a) {
            case 0:
                this.f9464b.C0(this.f9465c, true);
                return;
            default:
                this.f9464b.B0(this.f9465c);
                return;
        }
    }
}
