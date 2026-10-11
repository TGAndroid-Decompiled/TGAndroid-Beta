package ci;
public final class t4 implements Runnable {
    public final int f5994a;
    public final q6 f5995b;
    public final qg.b2 f5996c;

    public t4(q6 q6Var, qg.b2 b2Var, int i10) {
        this.f5994a = i10;
        this.f5995b = q6Var;
        this.f5996c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f5994a) {
            case 0:
                this.f5995b.C0(this.f5996c, true);
                return;
            default:
                this.f5995b.B0(this.f5996c);
                return;
        }
    }
}
