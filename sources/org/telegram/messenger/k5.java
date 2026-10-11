package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18359a;
    public final LocaleController f18360b;
    public final int f18361c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f18359a = i11;
        this.f18360b = localeController;
        this.f18361c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18359a) {
            case 0:
                LocaleController.u(this.f18360b, this.f18361c);
                return;
            case 1:
                LocaleController.h(this.f18360b, this.f18361c);
                return;
            case 2:
                LocaleController.k(this.f18360b, this.f18361c);
                return;
            default:
                LocaleController.q(this.f18360b, this.f18361c);
                return;
        }
    }
}
