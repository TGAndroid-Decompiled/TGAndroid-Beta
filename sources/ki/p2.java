package ki;
public final class p2 implements Runnable {
    public final int f15443a;
    public final w3 f15444b;
    public final int f15445c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15443a = i12;
        this.f15444b = w3Var;
        this.f15445c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15443a) {
            case 0:
                this.f15444b.Z1(this.f15445c, this.d);
                return;
            default:
                this.f15444b.h4(this.f15445c, this.d);
                return;
        }
    }
}
