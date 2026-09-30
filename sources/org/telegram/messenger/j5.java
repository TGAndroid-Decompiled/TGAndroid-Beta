package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16724a;
    public final LocaleController f16725b;
    public final int f16726c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16724a = i11;
        this.f16725b = localeController;
        this.f16726c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16724a) {
            case 0:
                LocaleController.u(this.f16725b, this.f16726c);
                return;
            case 1:
                LocaleController.h(this.f16725b, this.f16726c);
                return;
            case 2:
                LocaleController.k(this.f16725b, this.f16726c);
                return;
            default:
                LocaleController.q(this.f16725b, this.f16726c);
                return;
        }
    }
}
