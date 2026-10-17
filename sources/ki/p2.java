package ki;
public final class p2 implements Runnable {
    public final int f15436a;
    public final w3 f15437b;
    public final int f15438c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15436a = i12;
        this.f15437b = w3Var;
        this.f15438c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15436a) {
            case 0:
                this.f15437b.Z1(this.f15438c, this.d);
                return;
            default:
                this.f15437b.h4(this.f15438c, this.d);
                return;
        }
    }
}
