package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16688a;
    public final LocaleController f16689b;
    public final int f16690c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16688a = i11;
        this.f16689b = localeController;
        this.f16690c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16688a) {
            case 0:
                LocaleController.u(this.f16689b, this.f16690c);
                return;
            case 1:
                LocaleController.h(this.f16689b, this.f16690c);
                return;
            case 2:
                LocaleController.k(this.f16689b, this.f16690c);
                return;
            default:
                LocaleController.q(this.f16689b, this.f16690c);
                return;
        }
    }
}
