package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18321a;
    public final LocaleController f18322b;
    public final int f18323c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f18321a = i11;
        this.f18322b = localeController;
        this.f18323c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18321a) {
            case 0:
                LocaleController.u(this.f18322b, this.f18323c);
                return;
            case 1:
                LocaleController.h(this.f18322b, this.f18323c);
                return;
            case 2:
                LocaleController.k(this.f18322b, this.f18323c);
                return;
            default:
                LocaleController.q(this.f18322b, this.f18323c);
                return;
        }
    }
}
