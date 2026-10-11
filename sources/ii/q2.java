package ii;
public final class q2 implements Runnable {
    public final int f12632a;
    public final x3 f12633b;
    public final int f12634c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f12632a = i12;
        this.f12633b = x3Var;
        this.f12634c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12632a) {
            case 0:
                this.f12633b.Z1(this.f12634c, this.d);
                return;
            default:
                this.f12633b.h4(this.f12634c, this.d);
                return;
        }
    }
}
