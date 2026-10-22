package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f19175a;
    public final LocaleController f19176b;
    public final int f19177c;

    public p5(LocaleController localeController, int i10, int i11) {
        this.f19175a = i11;
        this.f19176b = localeController;
        this.f19177c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19175a) {
            case 0:
                LocaleController.u(this.f19176b, this.f19177c);
                return;
            case 1:
                LocaleController.h(this.f19176b, this.f19177c);
                return;
            case 2:
                LocaleController.k(this.f19176b, this.f19177c);
                return;
            default:
                LocaleController.q(this.f19176b, this.f19177c);
                return;
        }
    }
}
