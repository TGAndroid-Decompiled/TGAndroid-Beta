package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16708a;
    public final LocaleController f16709b;
    public final int f16710c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16708a = i11;
        this.f16709b = localeController;
        this.f16710c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16708a) {
            case 0:
                LocaleController.u(this.f16709b, this.f16710c);
                return;
            case 1:
                LocaleController.h(this.f16709b, this.f16710c);
                return;
            case 2:
                LocaleController.k(this.f16709b, this.f16710c);
                return;
            default:
                LocaleController.q(this.f16709b, this.f16710c);
                return;
        }
    }
}
