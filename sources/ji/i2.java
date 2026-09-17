package ji;
public final class i2 implements Runnable {
    public final int f14005a;
    public final v3 f14006b;
    public final int f14007c;

    public i2(v3 v3Var, int i10, int i11) {
        this.f14005a = i11;
        this.f14006b = v3Var;
        this.f14007c = i10;
    }

    @Override
    public final void run() {
        switch (this.f14005a) {
            case 0:
                this.f14006b.c4(this.f14007c);
                return;
            case 1:
                this.f14006b.e4(this.f14007c);
                return;
            case 2:
                this.f14006b.scrollBy(0, this.f14007c);
                return;
            default:
                this.f14006b.d4(this.f14007c);
                return;
        }
    }
}
