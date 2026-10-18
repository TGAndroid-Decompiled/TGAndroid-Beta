package ki;
public final class p2 implements Runnable {
    public final int f15441a;
    public final w3 f15442b;
    public final int f15443c;
    public final int d;

    public p2(w3 w3Var, int i10, int i11, int i12) {
        this.f15441a = i12;
        this.f15442b = w3Var;
        this.f15443c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15441a) {
            case 0:
                this.f15442b.Z1(this.f15443c, this.d);
                return;
            default:
                this.f15442b.h4(this.f15443c, this.d);
                return;
        }
    }
}
