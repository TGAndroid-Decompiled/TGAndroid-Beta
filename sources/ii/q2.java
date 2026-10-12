package ii;
public final class q2 implements Runnable {
    public final int f12639a;
    public final x3 f12640b;
    public final int f12641c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f12639a = i12;
        this.f12640b = x3Var;
        this.f12641c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12639a) {
            case 0:
                this.f12640b.Z1(this.f12641c, this.d);
                return;
            default:
                this.f12640b.h4(this.f12641c, this.d);
                return;
        }
    }
}
