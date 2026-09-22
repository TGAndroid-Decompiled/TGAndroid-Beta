package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16702a;
    public final LocaleController f16703b;
    public final int f16704c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16702a = i11;
        this.f16703b = localeController;
        this.f16704c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16702a) {
            case 0:
                LocaleController.u(this.f16703b, this.f16704c);
                return;
            case 1:
                LocaleController.h(this.f16703b, this.f16704c);
                return;
            case 2:
                LocaleController.k(this.f16703b, this.f16704c);
                return;
            default:
                LocaleController.q(this.f16703b, this.f16704c);
                return;
        }
    }
}
