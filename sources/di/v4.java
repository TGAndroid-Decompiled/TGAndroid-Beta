package di;
public final class v4 implements Runnable {
    public final int f8285a;
    public final q6 f8286b;
    public final rg.d2 f8287c;

    public v4(q6 q6Var, rg.d2 d2Var, int i10) {
        this.f8285a = i10;
        this.f8286b = q6Var;
        this.f8287c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f8285a) {
            case 0:
                this.f8286b.D0(this.f8287c, true);
                return;
            default:
                this.f8286b.C0(this.f8287c);
                return;
        }
    }
}
