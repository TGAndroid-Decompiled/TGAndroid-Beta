package hi;
public final class b9 implements Runnable {
    public final int f14300a;
    public final sa f14301b;
    public final boolean f14302c;

    public b9(sa saVar, boolean z10, int i7) {
        this.f14300a = i7;
        this.f14301b = saVar;
        this.f14302c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14300a) {
            case 0:
                this.f14301b.e(this.f14302c);
                return;
            case 1:
                sa saVar = this.f14301b;
                if (!this.f14302c) {
                    saVar.K0.b(false, false);
                    return;
                } else {
                    saVar.getClass();
                    return;
                }
            default:
                sa saVar2 = this.f14301b;
                saVar2.S = null;
                saVar2.f15398e = false;
                saVar2.p(this.f14302c);
                return;
        }
    }
}
