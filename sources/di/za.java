package di;
public final class za implements Runnable {
    public final int f8192a;
    public final kc f8193b;

    public za(kc kcVar, int i10) {
        this.f8192a = i10;
        this.f8193b = kcVar;
    }

    @Override
    public final void run() {
        switch (this.f8192a) {
            case 0:
                kc kcVar = this.f8193b;
                kcVar.getClass();
                kcVar.f(1.0f, true, new ga(kcVar, 6));
                kcVar.f7239b1.b(true, true);
                return;
            default:
                kc kcVar2 = this.f8193b;
                kcVar2.e(false);
                kcVar2.f7273m2 = null;
                return;
        }
    }
}
