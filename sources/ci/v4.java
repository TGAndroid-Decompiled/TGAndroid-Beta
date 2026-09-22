package ci;
public final class v4 implements Runnable {
    public final int f5650a;
    public final r6 f5651b;
    public final qg.c2 f5652c;

    public v4(r6 r6Var, qg.c2 c2Var, int i10) {
        this.f5650a = i10;
        this.f5651b = r6Var;
        this.f5652c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5650a) {
            case 0:
                this.f5651b.D0(this.f5652c, true);
                return;
            default:
                this.f5651b.C0(this.f5652c);
                return;
        }
    }
}
