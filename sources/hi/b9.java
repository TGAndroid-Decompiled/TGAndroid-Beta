package hi;
public final class b9 implements Runnable {
    public final int f14297a;
    public final sa f14298b;
    public final boolean f14299c;

    public b9(sa saVar, boolean z10, int i7) {
        this.f14297a = i7;
        this.f14298b = saVar;
        this.f14299c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14297a) {
            case 0:
                this.f14298b.e(this.f14299c);
                return;
            case 1:
                sa saVar = this.f14298b;
                if (!this.f14299c) {
                    saVar.K0.b(false, false);
                    return;
                } else {
                    saVar.getClass();
                    return;
                }
            default:
                sa saVar2 = this.f14298b;
                saVar2.S = null;
                saVar2.f15395e = false;
                saVar2.p(this.f14299c);
                return;
        }
    }
}
