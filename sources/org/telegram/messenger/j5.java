package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f18229a;
    public final LocaleController f18230b;
    public final int f18231c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f18229a = i11;
        this.f18230b = localeController;
        this.f18231c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18229a) {
            case 0:
                LocaleController.u(this.f18230b, this.f18231c);
                return;
            case 1:
                LocaleController.h(this.f18230b, this.f18231c);
                return;
            case 2:
                LocaleController.k(this.f18230b, this.f18231c);
                return;
            default:
                LocaleController.q(this.f18230b, this.f18231c);
                return;
        }
    }
}
