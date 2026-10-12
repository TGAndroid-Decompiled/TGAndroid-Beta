package di;
public final class qa implements Runnable {
    public final int f7651a;
    public final kc f7652b;
    public final boolean f7653c;

    public qa(kc kcVar, boolean z10, int i10) {
        this.f7651a = i10;
        this.f7652b = kcVar;
        this.f7653c = z10;
    }

    @Override
    public final void run() {
        switch (this.f7651a) {
            case 0:
                this.f7652b.e(this.f7653c);
                return;
            case 1:
                kc kcVar = this.f7652b;
                if (!this.f7653c) {
                    kcVar.J0.b(false, false);
                    return;
                } else {
                    kcVar.getClass();
                    return;
                }
            default:
                kc kcVar2 = this.f7652b;
                kcVar2.R = null;
                kcVar2.e = false;
                kcVar2.p(this.f7653c);
                return;
        }
    }
}
