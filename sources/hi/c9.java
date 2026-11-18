package hi;
public final class c9 implements Runnable {
    public final int f14319a;
    public final ta f14320b;
    public final boolean f14321c;

    public c9(ta taVar, boolean z10, int i7) {
        this.f14319a = i7;
        this.f14320b = taVar;
        this.f14321c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14319a) {
            case 0:
                this.f14320b.e(this.f14321c);
                return;
            case 1:
                ta taVar = this.f14320b;
                if (!this.f14321c) {
                    taVar.K0.b(false, false);
                    return;
                } else {
                    taVar.getClass();
                    return;
                }
            default:
                ta taVar2 = this.f14320b;
                taVar2.S = null;
                taVar2.f15437e = false;
                taVar2.p(this.f14321c);
                return;
        }
    }
}
