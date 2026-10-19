package ki;
public final class p2 implements Runnable {
    public final int f15442a;
    public final w3 f15443b;
    public final int f15444c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15442a = i12;
        this.f15443b = w3Var;
        this.f15444c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15442a) {
            case 0:
                this.f15443b.Z1(this.f15444c, this.d);
                return;
            default:
                this.f15443b.h4(this.f15444c, this.d);
                return;
        }
    }
}
