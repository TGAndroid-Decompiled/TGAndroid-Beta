package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16707a;
    public final LocaleController f16708b;
    public final int f16709c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16707a = i11;
        this.f16708b = localeController;
        this.f16709c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16707a) {
            case 0:
                LocaleController.u(this.f16708b, this.f16709c);
                return;
            case 1:
                LocaleController.h(this.f16708b, this.f16709c);
                return;
            case 2:
                LocaleController.k(this.f16708b, this.f16709c);
                return;
            default:
                LocaleController.q(this.f16708b, this.f16709c);
                return;
        }
    }
}
