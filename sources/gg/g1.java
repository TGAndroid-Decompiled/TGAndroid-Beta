package gg;
public final class g1 implements Runnable {
    public final int f6639a;
    public final i1 f6640b;

    public g1(i1 i1Var, int i10) {
        this.f6639a = i10;
        this.f6640b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f6639a) {
            case 0:
                i1.e0(this.f6640b);
                return;
            default:
                i1.d0(this.f6640b);
                return;
        }
    }
}
