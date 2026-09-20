package ci;
public final class v4 implements Runnable {
    public final int f5652a;
    public final r6 f5653b;
    public final qg.c2 f5654c;

    public v4(r6 r6Var, qg.c2 c2Var, int i10) {
        this.f5652a = i10;
        this.f5653b = r6Var;
        this.f5654c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5652a) {
            case 0:
                this.f5653b.D0(this.f5654c, true);
                return;
            default:
                this.f5653b.C0(this.f5654c);
                return;
        }
    }
}
