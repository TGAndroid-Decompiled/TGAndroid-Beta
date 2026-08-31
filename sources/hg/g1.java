package hg;
public final class g1 implements Runnable {
    public final int f7497a;
    public final i1 f7498b;

    public g1(i1 i1Var, int i10) {
        this.f7497a = i10;
        this.f7498b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f7497a) {
            case 0:
                i1.e0(this.f7498b);
                return;
            default:
                i1.d0(this.f7498b);
                return;
        }
    }
}
