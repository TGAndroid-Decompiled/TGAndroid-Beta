package org.telegram.messenger;
public final class i5 implements Runnable {
    public final int f20557a;
    public final LocaleController f20558b;
    public final int f20559c;

    public i5(LocaleController localeController, int i9, int i10) {
        this.f20557a = i10;
        this.f20558b = localeController;
        this.f20559c = i9;
    }

    @Override
    public final void run() {
        switch (this.f20557a) {
            case 0:
                LocaleController.u(this.f20558b, this.f20559c);
                return;
            case 1:
                LocaleController.h(this.f20558b, this.f20559c);
                return;
            case 2:
                LocaleController.k(this.f20558b, this.f20559c);
                return;
            default:
                LocaleController.q(this.f20558b, this.f20559c);
                return;
        }
    }
}
