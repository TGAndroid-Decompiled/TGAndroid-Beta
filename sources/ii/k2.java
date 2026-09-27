package ii;
public final class k2 implements Runnable {
    public final int f11469a;
    public final x3 f11470b;
    public final int f11471c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f11469a = i11;
        this.f11470b = x3Var;
        this.f11471c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11469a) {
            case 0:
                this.f11470b.e4(this.f11471c);
                return;
            case 1:
                this.f11470b.g4(this.f11471c);
                return;
            case 2:
                this.f11470b.scrollBy(0, this.f11471c);
                return;
            default:
                this.f11470b.f4(this.f11471c);
                return;
        }
    }
}
