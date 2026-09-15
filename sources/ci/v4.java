package ci;
public final class v4 implements Runnable {
    public final int f5646a;
    public final r6 f5647b;
    public final qg.e2 f5648c;

    public v4(r6 r6Var, qg.e2 e2Var, int i10) {
        this.f5646a = i10;
        this.f5647b = r6Var;
        this.f5648c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5646a) {
            case 0:
                this.f5647b.D0(this.f5648c, true);
                return;
            default:
                this.f5647b.C0(this.f5648c);
                return;
        }
    }
}
