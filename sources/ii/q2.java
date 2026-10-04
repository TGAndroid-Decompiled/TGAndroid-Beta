package ii;
public final class q2 implements Runnable {
    public final int f12585a;
    public final x3 f12586b;
    public final int f12587c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f12585a = i12;
        this.f12586b = x3Var;
        this.f12587c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12585a) {
            case 0:
                this.f12586b.a2(this.f12587c, this.d);
                return;
            default:
                this.f12586b.i4(this.f12587c, this.d);
                return;
        }
    }
}
