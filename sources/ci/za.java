package ci;
public final class za implements Runnable {
    public final int f5920a;
    public final kc f5921b;

    public za(kc kcVar, int i10) {
        this.f5920a = i10;
        this.f5921b = kcVar;
    }

    @Override
    public final void run() {
        switch (this.f5920a) {
            case 0:
                kc kcVar = this.f5921b;
                kcVar.getClass();
                kcVar.g(1.0f, true, new ga(kcVar, 6));
                kcVar.f4987b1.b(true, true);
                return;
            default:
                kc kcVar2 = this.f5921b;
                kcVar2.f(false);
                kcVar2.f5021m2 = null;
                return;
        }
    }
}
