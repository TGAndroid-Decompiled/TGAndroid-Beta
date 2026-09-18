package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16638a;
    public final LocaleController f16639b;
    public final int f16640c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16638a = i11;
        this.f16639b = localeController;
        this.f16640c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16638a) {
            case 0:
                LocaleController.u(this.f16639b, this.f16640c);
                return;
            case 1:
                LocaleController.h(this.f16639b, this.f16640c);
                return;
            case 2:
                LocaleController.k(this.f16639b, this.f16640c);
                return;
            default:
                LocaleController.q(this.f16639b, this.f16640c);
                return;
        }
    }
}
