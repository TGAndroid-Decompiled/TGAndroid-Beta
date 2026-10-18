package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18938a;
    public final LocaleController f18939b;
    public final int f18940c;

    public m5(LocaleController localeController, int i10, int i11) {
        this.f18938a = i11;
        this.f18939b = localeController;
        this.f18940c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18938a) {
            case 0:
                LocaleController.u(this.f18939b, this.f18940c);
                return;
            case 1:
                LocaleController.h(this.f18939b, this.f18940c);
                return;
            case 2:
                LocaleController.k(this.f18939b, this.f18940c);
                return;
            default:
                LocaleController.q(this.f18939b, this.f18940c);
                return;
        }
    }
}
