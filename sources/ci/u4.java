package ci;
public final class u4 implements Runnable {
    public final int f5612a;
    public final q6 f5613b;
    public final qg.c2 f5614c;

    public u4(q6 q6Var, qg.c2 c2Var, int i10) {
        this.f5612a = i10;
        this.f5613b = q6Var;
        this.f5614c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5612a) {
            case 0:
                this.f5613b.D0(this.f5614c, true);
                return;
            default:
                this.f5613b.C0(this.f5614c);
                return;
        }
    }
}
