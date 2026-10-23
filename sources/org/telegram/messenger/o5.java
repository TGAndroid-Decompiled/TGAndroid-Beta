package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19173a;
    public final LocaleController f19174b;
    public final int f19175c;

    public o5(LocaleController localeController, int i10, int i11) {
        this.f19173a = i11;
        this.f19174b = localeController;
        this.f19175c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19173a) {
            case 0:
                LocaleController.u(this.f19174b, this.f19175c);
                return;
            case 1:
                LocaleController.h(this.f19174b, this.f19175c);
                return;
            case 2:
                LocaleController.k(this.f19174b, this.f19175c);
                return;
            default:
                LocaleController.q(this.f19174b, this.f19175c);
                return;
        }
    }
}
