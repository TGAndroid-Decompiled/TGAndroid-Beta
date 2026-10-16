package di;
public final class za implements Runnable {
    public final int f8195a;
    public final kc f8196b;

    public za(kc kcVar, int i10) {
        this.f8195a = i10;
        this.f8196b = kcVar;
    }

    @Override
    public final void run() {
        switch (this.f8195a) {
            case 0:
                kc kcVar = this.f8196b;
                kcVar.getClass();
                kcVar.f(1.0f, true, new ga(kcVar, 6));
                kcVar.f7242b1.b(true, true);
                return;
            default:
                kc kcVar2 = this.f8196b;
                kcVar2.e(false);
                kcVar2.f7276m2 = null;
                return;
        }
    }
}
