package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f21087a;
    public final LocaleController f21088b;
    public final int f21089c;

    public r5(LocaleController localeController, int i10, int i11) {
        this.f21087a = i11;
        this.f21088b = localeController;
        this.f21089c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21087a) {
            case 0:
                LocaleController.u(this.f21088b, this.f21089c);
                return;
            case 1:
                LocaleController.h(this.f21088b, this.f21089c);
                return;
            case 2:
                LocaleController.k(this.f21088b, this.f21089c);
                return;
            default:
                LocaleController.q(this.f21088b, this.f21089c);
                return;
        }
    }
}
