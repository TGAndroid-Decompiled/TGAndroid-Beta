package ki;
public final class p2 implements Runnable {
    public final int f15444a;
    public final w3 f15445b;
    public final int f15446c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15444a = i12;
        this.f15445b = w3Var;
        this.f15446c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15444a) {
            case 0:
                this.f15445b.Z1(this.f15446c, this.d);
                return;
            default:
                this.f15445b.h4(this.f15446c, this.d);
                return;
        }
    }
}
