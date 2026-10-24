package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f19242a;
    public final LocaleController f19243b;
    public final int f19244c;

    public p5(LocaleController localeController, int i10, int i11) {
        this.f19242a = i11;
        this.f19243b = localeController;
        this.f19244c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19242a) {
            case 0:
                LocaleController.u(this.f19243b, this.f19244c);
                return;
            case 1:
                LocaleController.h(this.f19243b, this.f19244c);
                return;
            case 2:
                LocaleController.k(this.f19243b, this.f19244c);
                return;
            default:
                LocaleController.q(this.f19243b, this.f19244c);
                return;
        }
    }
}
