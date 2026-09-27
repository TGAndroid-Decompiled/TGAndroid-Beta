package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16700a;
    public final LocaleController f16701b;
    public final int f16702c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16700a = i11;
        this.f16701b = localeController;
        this.f16702c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16700a) {
            case 0:
                LocaleController.u(this.f16701b, this.f16702c);
                return;
            case 1:
                LocaleController.h(this.f16701b, this.f16702c);
                return;
            case 2:
                LocaleController.k(this.f16701b, this.f16702c);
                return;
            default:
                LocaleController.q(this.f16701b, this.f16702c);
                return;
        }
    }
}
