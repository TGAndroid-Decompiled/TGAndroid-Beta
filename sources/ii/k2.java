package ii;
public final class k2 implements Runnable {
    public final int f12535a;
    public final x3 f12536b;
    public final int f12537c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f12535a = i11;
        this.f12536b = x3Var;
        this.f12537c = i10;
    }

    @Override
    public final void run() {
        switch (this.f12535a) {
            case 0:
                this.f12536b.e4(this.f12537c);
                return;
            case 1:
                this.f12536b.g4(this.f12537c);
                return;
            case 2:
                this.f12536b.scrollBy(0, this.f12537c);
                return;
            default:
                this.f12536b.f4(this.f12537c);
                return;
        }
    }
}
