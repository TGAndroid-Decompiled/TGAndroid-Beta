package ki;
public final class p2 implements Runnable {
    public final int f15502a;
    public final w3 f15503b;
    public final int f15504c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15502a = i12;
        this.f15503b = w3Var;
        this.f15504c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15502a) {
            case 0:
                this.f15503b.e2(this.f15504c, this.d);
                return;
            default:
                this.f15503b.m4(this.f15504c, this.d);
                return;
        }
    }
}
