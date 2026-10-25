package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f21006a;
    public final LocaleController f21007b;
    public final int f21008c;

    public q5(LocaleController localeController, int i10, int i11) {
        this.f21006a = i11;
        this.f21007b = localeController;
        this.f21008c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21006a) {
            case 0:
                LocaleController.u(this.f21007b, this.f21008c);
                return;
            case 1:
                LocaleController.h(this.f21007b, this.f21008c);
                return;
            case 2:
                LocaleController.k(this.f21007b, this.f21008c);
                return;
            default:
                LocaleController.q(this.f21007b, this.f21008c);
                return;
        }
    }
}
