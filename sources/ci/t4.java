package ci;
public final class t4 implements Runnable {
    public final int f5993a;
    public final q6 f5994b;
    public final qg.c2 f5995c;

    public t4(q6 q6Var, qg.c2 c2Var, int i10) {
        this.f5993a = i10;
        this.f5994b = q6Var;
        this.f5995c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5993a) {
            case 0:
                this.f5994b.C0(this.f5995c, true);
                return;
            default:
                this.f5994b.B0(this.f5995c);
                return;
        }
    }
}
