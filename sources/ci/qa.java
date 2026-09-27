package ci;
public final class qa implements Runnable {
    public final int f5386a;
    public final kc f5387b;
    public final boolean f5388c;

    public qa(kc kcVar, boolean z10, int i10) {
        this.f5386a = i10;
        this.f5387b = kcVar;
        this.f5388c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5386a) {
            case 0:
                this.f5387b.f(this.f5388c);
                return;
            case 1:
                kc kcVar = this.f5387b;
                if (!this.f5388c) {
                    kcVar.J0.b(false, false);
                    return;
                } else {
                    kcVar.getClass();
                    return;
                }
            default:
                kc kcVar2 = this.f5387b;
                kcVar2.R = null;
                kcVar2.e = false;
                kcVar2.q(this.f5388c);
                return;
        }
    }
}
