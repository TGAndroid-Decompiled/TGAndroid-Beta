package ei;
public final class m4 implements Runnable {
    public final int f9464a;
    public final f6 f9465b;
    public final rg.b2 f9466c;

    public m4(f6 f6Var, rg.b2 b2Var, int i10) {
        this.f9464a = i10;
        this.f9465b = f6Var;
        this.f9466c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f9464a) {
            case 0:
                this.f9465b.C0(this.f9466c, true);
                return;
            default:
                this.f9465b.B0(this.f9466c);
                return;
        }
    }
}
