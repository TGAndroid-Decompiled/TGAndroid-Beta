package ci;
public final class v4 implements Runnable {
    public final int f5648a;
    public final r6 f5649b;
    public final qg.e2 f5650c;

    public v4(r6 r6Var, qg.e2 e2Var, int i10) {
        this.f5648a = i10;
        this.f5649b = r6Var;
        this.f5650c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5648a) {
            case 0:
                this.f5649b.D0(this.f5650c, true);
                return;
            default:
                this.f5649b.C0(this.f5650c);
                return;
        }
    }
}
