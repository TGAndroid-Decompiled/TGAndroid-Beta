package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16687a;
    public final LocaleController f16688b;
    public final int f16689c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16687a = i11;
        this.f16688b = localeController;
        this.f16689c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16687a) {
            case 0:
                LocaleController.u(this.f16688b, this.f16689c);
                return;
            case 1:
                LocaleController.h(this.f16688b, this.f16689c);
                return;
            case 2:
                LocaleController.k(this.f16688b, this.f16689c);
                return;
            default:
                LocaleController.q(this.f16688b, this.f16689c);
                return;
        }
    }
}
