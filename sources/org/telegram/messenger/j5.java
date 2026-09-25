package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16703a;
    public final LocaleController f16704b;
    public final int f16705c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16703a = i11;
        this.f16704b = localeController;
        this.f16705c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16703a) {
            case 0:
                LocaleController.u(this.f16704b, this.f16705c);
                return;
            case 1:
                LocaleController.h(this.f16704b, this.f16705c);
                return;
            case 2:
                LocaleController.k(this.f16704b, this.f16705c);
                return;
            default:
                LocaleController.q(this.f16704b, this.f16705c);
                return;
        }
    }
}
