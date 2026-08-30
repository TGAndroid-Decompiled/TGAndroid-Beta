package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f17729a;
    public final LocaleController f17730b;
    public final int f17731c;

    public l5(LocaleController localeController, int i10, int i11) {
        this.f17729a = i11;
        this.f17730b = localeController;
        this.f17731c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17729a) {
            case 0:
                LocaleController.u(this.f17730b, this.f17731c);
                return;
            case 1:
                LocaleController.h(this.f17730b, this.f17731c);
                return;
            case 2:
                LocaleController.k(this.f17730b, this.f17731c);
                return;
            default:
                LocaleController.q(this.f17730b, this.f17731c);
                return;
        }
    }
}
