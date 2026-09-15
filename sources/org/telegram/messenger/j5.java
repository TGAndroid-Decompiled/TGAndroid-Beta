package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16457a;
    public final LocaleController f16458b;
    public final int f16459c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16457a = i11;
        this.f16458b = localeController;
        this.f16459c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16457a) {
            case 0:
                LocaleController.u(this.f16458b, this.f16459c);
                return;
            case 1:
                LocaleController.h(this.f16458b, this.f16459c);
                return;
            case 2:
                LocaleController.k(this.f16458b, this.f16459c);
                return;
            default:
                LocaleController.q(this.f16458b, this.f16459c);
                return;
        }
    }
}
