package ii;
public final class k2 implements Runnable {
    public final int f11466a;
    public final x3 f11467b;
    public final int f11468c;

    public k2(x3 x3Var, int i10, int i11) {
        this.f11466a = i11;
        this.f11467b = x3Var;
        this.f11468c = i10;
    }

    @Override
    public final void run() {
        switch (this.f11466a) {
            case 0:
                this.f11467b.d4(this.f11468c);
                return;
            case 1:
                this.f11467b.f4(this.f11468c);
                return;
            case 2:
                this.f11467b.scrollBy(0, this.f11468c);
                return;
            default:
                this.f11467b.e4(this.f11468c);
                return;
        }
    }
}
