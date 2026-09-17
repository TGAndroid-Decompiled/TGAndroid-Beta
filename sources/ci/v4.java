package ci;
public final class v4 implements Runnable {
    public final int f5651a;
    public final r6 f5652b;
    public final qg.e2 f5653c;

    public v4(r6 r6Var, qg.e2 e2Var, int i10) {
        this.f5651a = i10;
        this.f5652b = r6Var;
        this.f5653c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5651a) {
            case 0:
                this.f5652b.D0(this.f5653c, true);
                return;
            default:
                this.f5652b.C0(this.f5653c);
                return;
        }
    }
}
