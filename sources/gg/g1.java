package gg;
public final class g1 implements Runnable {
    public final int f6652a;
    public final i1 f6653b;

    public g1(i1 i1Var, int i10) {
        this.f6652a = i10;
        this.f6653b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f6652a) {
            case 0:
                i1.e0(this.f6653b);
                return;
            default:
                i1.d0(this.f6653b);
                return;
        }
    }
}
