package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f17708a;
    public final LocaleController f17709b;
    public final int f17710c;

    public l5(LocaleController localeController, int i10, int i11) {
        this.f17708a = i11;
        this.f17709b = localeController;
        this.f17710c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17708a) {
            case 0:
                LocaleController.u(this.f17709b, this.f17710c);
                return;
            case 1:
                LocaleController.h(this.f17709b, this.f17710c);
                return;
            case 2:
                LocaleController.k(this.f17709b, this.f17710c);
                return;
            default:
                LocaleController.q(this.f17709b, this.f17710c);
                return;
        }
    }
}
