package ii;
public final class k2 implements Runnable {
    public final int f11480a;
    public final x3 f11481b;
    public final int f11482c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f11480a = i11;
        this.f11481b = x3Var;
        this.f11482c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11480a) {
            case 0:
                this.f11481b.f4(this.f11482c);
                return;
            case 1:
                this.f11481b.h4(this.f11482c);
                return;
            case 2:
                this.f11481b.scrollBy(0, this.f11482c);
                return;
            default:
                this.f11481b.g4(this.f11482c);
                return;
        }
    }
}
