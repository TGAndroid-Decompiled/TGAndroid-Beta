package ii;
public final class q2 implements Runnable {
    public final int f11580a;
    public final x3 f11581b;
    public final int f11582c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f11580a = i12;
        this.f11581b = x3Var;
        this.f11582c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11580a) {
            case 0:
                this.f11581b.a2(this.f11582c, this.d);
                return;
            default:
                this.f11581b.i4(this.f11582c, this.d);
                return;
        }
    }
}
