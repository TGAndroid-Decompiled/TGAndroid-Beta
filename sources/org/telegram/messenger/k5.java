package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18323a;
    public final LocaleController f18324b;
    public final int f18325c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f18323a = i11;
        this.f18324b = localeController;
        this.f18325c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18323a) {
            case 0:
                LocaleController.u(this.f18324b, this.f18325c);
                return;
            case 1:
                LocaleController.h(this.f18324b, this.f18325c);
                return;
            case 2:
                LocaleController.k(this.f18324b, this.f18325c);
                return;
            default:
                LocaleController.q(this.f18324b, this.f18325c);
                return;
        }
    }
}
