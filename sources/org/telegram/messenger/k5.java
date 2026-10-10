package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18325a;
    public final LocaleController f18326b;
    public final int f18327c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f18325a = i11;
        this.f18326b = localeController;
        this.f18327c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18325a) {
            case 0:
                LocaleController.u(this.f18326b, this.f18327c);
                return;
            case 1:
                LocaleController.h(this.f18326b, this.f18327c);
                return;
            case 2:
                LocaleController.k(this.f18326b, this.f18327c);
                return;
            default:
                LocaleController.q(this.f18326b, this.f18327c);
                return;
        }
    }
}
