package ii;
public final class q2 implements Runnable {
    public final int f12633a;
    public final x3 f12634b;
    public final int f12635c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f12633a = i12;
        this.f12634b = x3Var;
        this.f12635c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12633a) {
            case 0:
                this.f12634b.Z1(this.f12635c, this.d);
                return;
            default:
                this.f12634b.h4(this.f12635c, this.d);
                return;
        }
    }
}
