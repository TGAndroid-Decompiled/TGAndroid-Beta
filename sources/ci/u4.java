package ci;
public final class u4 implements Runnable {
    public final int f5629a;
    public final q6 f5630b;
    public final qg.b2 f5631c;

    public u4(q6 q6Var, qg.b2 b2Var, int i10) {
        this.f5629a = i10;
        this.f5630b = q6Var;
        this.f5631c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f5629a) {
            case 0:
                this.f5630b.D0(this.f5631c, true);
                return;
            default:
                this.f5630b.C0(this.f5631c);
                return;
        }
    }
}
