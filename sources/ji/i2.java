package ji;
public final class i2 implements Runnable {
    public final int f13979a;
    public final v3 f13980b;
    public final int f13981c;

    public i2(v3 v3Var, int i10, int i11) {
        this.f13979a = i11;
        this.f13980b = v3Var;
        this.f13981c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13979a) {
            case 0:
                this.f13980b.c4(this.f13981c);
                return;
            case 1:
                this.f13980b.e4(this.f13981c);
                return;
            case 2:
                this.f13980b.scrollBy(0, this.f13981c);
                return;
            default:
                this.f13980b.d4(this.f13981c);
                return;
        }
    }
}
