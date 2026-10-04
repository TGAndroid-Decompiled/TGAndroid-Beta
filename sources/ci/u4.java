package ci;
public final class u4 implements Runnable {
    public final int f6060a;
    public final q6 f6061b;
    public final qg.b2 f6062c;

    public u4(q6 q6Var, qg.b2 b2Var, int i10) {
        this.f6060a = i10;
        this.f6061b = q6Var;
        this.f6062c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f6060a) {
            case 0:
                this.f6061b.D0(this.f6062c, true);
                return;
            default:
                this.f6061b.C0(this.f6062c);
                return;
        }
    }
}
