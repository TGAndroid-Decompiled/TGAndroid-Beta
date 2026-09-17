package di;
public final class v4 implements Runnable {
    public final int f8313a;
    public final q6 f8314b;
    public final rg.d2 f8315c;

    public v4(q6 q6Var, rg.d2 d2Var, int i10) {
        this.f8313a = i10;
        this.f8314b = q6Var;
        this.f8315c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f8313a) {
            case 0:
                this.f8314b.D0(this.f8315c, true);
                return;
            default:
                this.f8314b.C0(this.f8315c);
                return;
        }
    }
}
