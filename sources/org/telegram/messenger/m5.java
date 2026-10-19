package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18935a;
    public final LocaleController f18936b;
    public final int f18937c;

    public m5(LocaleController localeController, int i10, int i11) {
        this.f18935a = i11;
        this.f18936b = localeController;
        this.f18937c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18935a) {
            case 0:
                LocaleController.u(this.f18936b, this.f18937c);
                return;
            case 1:
                LocaleController.h(this.f18936b, this.f18937c);
                return;
            case 2:
                LocaleController.k(this.f18936b, this.f18937c);
                return;
            default:
                LocaleController.q(this.f18936b, this.f18937c);
                return;
        }
    }
}
