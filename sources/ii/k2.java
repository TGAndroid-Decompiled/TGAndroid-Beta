package ii;
public final class k2 implements Runnable {
    public final int f12536a;
    public final x3 f12537b;
    public final int f12538c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f12536a = i11;
        this.f12537b = x3Var;
        this.f12538c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12536a) {
            case 0:
                this.f12537b.e4(this.f12538c);
                return;
            case 1:
                this.f12537b.g4(this.f12538c);
                return;
            case 2:
                this.f12537b.scrollBy(0, this.f12538c);
                return;
            default:
                this.f12537b.f4(this.f12538c);
                return;
        }
    }
}
