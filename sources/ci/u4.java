package ci;
public final class u4 implements Runnable {
    public final int f6059a;
    public final q6 f6060b;
    public final qg.b2 f6061c;

    public u4(q6 q6Var, qg.b2 b2Var, int i10) {
        this.f6059a = i10;
        this.f6060b = q6Var;
        this.f6061c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f6059a) {
            case 0:
                this.f6060b.D0(this.f6061c, true);
                return;
            default:
                this.f6060b.C0(this.f6061c);
                return;
        }
    }
}
