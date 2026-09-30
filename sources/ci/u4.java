package ci;
public final class u4 implements Runnable {
    public final int f5603a;
    public final q6 f5604b;
    public final qg.c2 f5605c;

    public u4(q6 q6Var, qg.c2 c2Var, int i10) {
        this.f5603a = i10;
        this.f5604b = q6Var;
        this.f5605c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f5603a) {
            case 0:
                this.f5604b.D0(this.f5605c, true);
                return;
            default:
                this.f5604b.C0(this.f5605c);
                return;
        }
    }
}
