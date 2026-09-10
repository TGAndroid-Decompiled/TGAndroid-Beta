package hi;
public final class s2 implements Runnable {
    public final int f9845a;
    public final z3 f9846b;
    public final int f9847c;
    public final int d;

    public s2(z3 z3Var, int i10, int i11, int i12) {
        this.f9845a = i12;
        this.f9846b = z3Var;
        this.f9847c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f9845a) {
            case 0:
                this.f9846b.X1(this.f9847c, this.d);
                return;
            default:
                this.f9846b.f4(this.f9847c, this.d);
                return;
        }
    }
}
