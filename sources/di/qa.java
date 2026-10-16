package di;
public final class qa implements Runnable {
    public final int f7654a;
    public final kc f7655b;
    public final boolean f7656c;

    public qa(kc kcVar, boolean z10, int i10) {
        this.f7654a = i10;
        this.f7655b = kcVar;
        this.f7656c = z10;
    }

    @Override
    public final void run() {
        switch (this.f7654a) {
            case 0:
                this.f7655b.e(this.f7656c);
                return;
            case 1:
                kc kcVar = this.f7655b;
                if (!this.f7656c) {
                    kcVar.J0.b(false, false);
                    return;
                } else {
                    kcVar.getClass();
                    return;
                }
            default:
                kc kcVar2 = this.f7655b;
                kcVar2.R = null;
                kcVar2.e = false;
                kcVar2.p(this.f7656c);
                return;
        }
    }
}
