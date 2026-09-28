package ii;
public final class q2 implements Runnable {
    public final int f11566a;
    public final x3 f11567b;
    public final int f11568c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f11566a = i12;
        this.f11567b = x3Var;
        this.f11568c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11566a) {
            case 0:
                this.f11567b.Y1(this.f11568c, this.d);
                return;
            default:
                this.f11567b.g4(this.f11568c, this.d);
                return;
        }
    }
}
