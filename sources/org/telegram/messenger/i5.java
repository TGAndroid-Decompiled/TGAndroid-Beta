package org.telegram.messenger;
public final class i5 implements Runnable {
    public final int f17978a;
    public final LocaleController f17979b;
    public final int f17980c;

    public i5(LocaleController localeController, int i10, int i11) {
        this.f17978a = i11;
        this.f17979b = localeController;
        this.f17980c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                LocaleController.u(this.f17979b, this.f17980c);
                return;
            case 1:
                LocaleController.h(this.f17979b, this.f17980c);
                return;
            case 2:
                LocaleController.k(this.f17979b, this.f17980c);
                return;
            default:
                LocaleController.q(this.f17979b, this.f17980c);
                return;
        }
    }
}
