package kh;
public final class n4 implements Runnable {
    public final int f15745a;
    public final g6 f15746b;
    public final yf.b2 f15747c;

    public n4(g6 g6Var, yf.b2 b2Var, int i9) {
        this.f15745a = i9;
        this.f15746b = g6Var;
        this.f15747c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15745a) {
            case 0:
                this.f15746b.D0(this.f15747c, true);
                return;
            default:
                this.f15746b.C0(this.f15747c);
                return;
        }
    }
}
