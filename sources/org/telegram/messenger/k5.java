package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f20731a;
    public final LocaleController f20732b;
    public final int f20733c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f20731a = i11;
        this.f20732b = localeController;
        this.f20733c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20731a) {
            case 0:
                LocaleController.u(this.f20732b, this.f20733c);
                return;
            case 1:
                LocaleController.h(this.f20732b, this.f20733c);
                return;
            case 2:
                LocaleController.k(this.f20732b, this.f20733c);
                return;
            default:
                LocaleController.q(this.f20732b, this.f20733c);
                return;
        }
    }
}
