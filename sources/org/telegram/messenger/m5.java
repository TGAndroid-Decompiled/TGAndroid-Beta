package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18932a;
    public final LocaleController f18933b;
    public final int f18934c;

    public m5(LocaleController localeController, int i10, int i11) {
        this.f18932a = i11;
        this.f18933b = localeController;
        this.f18934c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18932a) {
            case 0:
                LocaleController.u(this.f18933b, this.f18934c);
                return;
            case 1:
                LocaleController.h(this.f18933b, this.f18934c);
                return;
            case 2:
                LocaleController.k(this.f18933b, this.f18934c);
                return;
            default:
                LocaleController.q(this.f18933b, this.f18934c);
                return;
        }
    }
}
