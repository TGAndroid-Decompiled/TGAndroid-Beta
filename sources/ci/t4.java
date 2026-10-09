package ci;
public final class t4 implements Runnable {
    public final int f5995a;
    public final q6 f5996b;
    public final qg.c2 f5997c;

    public t4(q6 q6Var, qg.c2 c2Var, int i10) {
        this.f5995a = i10;
        this.f5996b = q6Var;
        this.f5997c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5995a) {
            case 0:
                this.f5996b.C0(this.f5997c, true);
                return;
            default:
                this.f5996b.B0(this.f5997c);
                return;
        }
    }
}
