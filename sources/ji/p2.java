package ji;
public final class p2 implements Runnable {
    public final int f13464a;
    public final x3 f13465b;
    public final int f13466c;
    public final int d;

    public p2(x3 x3Var, int i10, int i11, int i12) {
        this.f13464a = i12;
        this.f13465b = x3Var;
        this.f13466c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f13464a) {
            case 0:
                this.f13465b.Z1(this.f13466c, this.d);
                return;
            default:
                this.f13465b.h4(this.f13466c, this.d);
                return;
        }
    }
}
