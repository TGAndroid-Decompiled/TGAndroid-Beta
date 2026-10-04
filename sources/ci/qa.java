package ci;
public final class qa implements Runnable {
    public final int f5796a;
    public final kc f5797b;
    public final boolean f5798c;

    public qa(kc kcVar, boolean z10, int i10) {
        this.f5796a = i10;
        this.f5797b = kcVar;
        this.f5798c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5796a) {
            case 0:
                this.f5797b.f(this.f5798c);
                return;
            case 1:
                kc kcVar = this.f5797b;
                if (!this.f5798c) {
                    kcVar.J0.b(false, false);
                    return;
                } else {
                    kcVar.getClass();
                    return;
                }
            default:
                kc kcVar2 = this.f5797b;
                kcVar2.R = null;
                kcVar2.f5387e = false;
                kcVar2.q(this.f5798c);
                return;
        }
    }
}
