package cg;

public final class i1 implements Runnable {

    public final int f2707a;

    public final k1 f2708b;

    public i1(k1 k1Var, int i10) {
        this.f2707a = i10;
        this.f2708b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f2707a) {
            case 0:
                k1.e0(this.f2708b);
                break;
            default:
                k1.d0(this.f2708b);
                break;
        }
    }
}
