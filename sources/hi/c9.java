package hi;
public final class c9 implements Runnable {
    public final int f14316a;
    public final ta f14317b;
    public final boolean f14318c;

    public c9(ta taVar, boolean z10, int i7) {
        this.f14316a = i7;
        this.f14317b = taVar;
        this.f14318c = z10;
    }

    @Override
    public final void run() {
        switch (this.f14316a) {
            case 0:
                this.f14317b.e(this.f14318c);
                return;
            case 1:
                ta taVar = this.f14317b;
                if (!this.f14318c) {
                    taVar.K0.b(false, false);
                    return;
                } else {
                    taVar.getClass();
                    return;
                }
            default:
                ta taVar2 = this.f14317b;
                taVar2.S = null;
                taVar2.f15434e = false;
                taVar2.p(this.f14318c);
                return;
        }
    }
}
