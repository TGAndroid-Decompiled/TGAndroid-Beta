package hi;
public final class c9 implements Runnable {
    public final int f14280a;
    public final ta f14281b;
    public final boolean f14282c;

    public c9(ta taVar, boolean z10, int i7) {
        this.f14280a = i7;
        this.f14281b = taVar;
        this.f14282c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14280a) {
            case 0:
                this.f14281b.e(this.f14282c);
                return;
            case 1:
                ta taVar = this.f14281b;
                if (!this.f14282c) {
                    taVar.K0.b(false, false);
                    return;
                } else {
                    taVar.getClass();
                    return;
                }
            default:
                ta taVar2 = this.f14281b;
                taVar2.S = null;
                taVar2.f15401e = false;
                taVar2.p(this.f14282c);
                return;
        }
    }
}
