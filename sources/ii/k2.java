package ii;
public final class k2 implements Runnable {
    public final int f12532a;
    public final x3 f12533b;
    public final int f12534c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f12532a = i11;
        this.f12533b = x3Var;
        this.f12534c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12532a) {
            case 0:
                this.f12533b.e4(this.f12534c);
                return;
            case 1:
                this.f12533b.g4(this.f12534c);
                return;
            case 2:
                this.f12533b.scrollBy(0, this.f12534c);
                return;
            default:
                this.f12533b.f4(this.f12534c);
                return;
        }
    }
}
