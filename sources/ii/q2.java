package ii;
public final class q2 implements Runnable {
    public final int f11569a;
    public final x3 f11570b;
    public final int f11571c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f11569a = i12;
        this.f11570b = x3Var;
        this.f11571c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f11569a) {
            case 0:
                this.f11570b.Z1(this.f11571c, this.d);
                return;
            default:
                this.f11570b.h4(this.f11571c, this.d);
                return;
        }
    }
}
