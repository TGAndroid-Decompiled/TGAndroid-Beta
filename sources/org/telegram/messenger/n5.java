package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f17618a;
    public final LocaleController f17619b;
    public final int f17620c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f17618a = i11;
        this.f17619b = localeController;
        this.f17620c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17618a) {
            case 0:
                LocaleController.u(this.f17619b, this.f17620c);
                return;
            case 1:
                LocaleController.h(this.f17619b, this.f17620c);
                return;
            case 2:
                LocaleController.k(this.f17619b, this.f17620c);
                return;
            default:
                LocaleController.q(this.f17619b, this.f17620c);
                return;
        }
    }
}
