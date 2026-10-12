package ji;
public final class j2 implements Runnable {
    public final int f13348a;
    public final x3 f13349b;
    public final int f13350c;

    public j2(x3 x3Var, int i10, int i11) {
        this.f13348a = i11;
        this.f13349b = x3Var;
        this.f13350c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13348a) {
            case 0:
                this.f13349b.e4(this.f13350c);
                return;
            case 1:
                this.f13349b.g4(this.f13350c);
                return;
            case 2:
                this.f13349b.scrollBy(0, this.f13350c);
                return;
            default:
                this.f13349b.f4(this.f13350c);
                return;
        }
    }
}
