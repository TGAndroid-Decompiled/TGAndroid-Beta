package ci;
public final class qa implements Runnable {
    public final int f5797a;
    public final kc f5798b;
    public final boolean f5799c;

    public qa(kc kcVar, boolean z10, int i10) {
        this.f5797a = i10;
        this.f5798b = kcVar;
        this.f5799c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5797a) {
            case 0:
                this.f5798b.f(this.f5799c);
                return;
            case 1:
                kc kcVar = this.f5798b;
                if (!this.f5799c) {
                    kcVar.J0.b(false, false);
                    return;
                } else {
                    kcVar.getClass();
                    return;
                }
            default:
                kc kcVar2 = this.f5798b;
                kcVar2.R = null;
                kcVar2.f5388e = false;
                kcVar2.q(this.f5799c);
                return;
        }
    }
}
