package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f18347a;
    public final LocaleController f18348b;
    public final int f18349c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f18347a = i11;
        this.f18348b = localeController;
        this.f18349c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18347a) {
            case 0:
                LocaleController.u(this.f18348b, this.f18349c);
                return;
            case 1:
                LocaleController.h(this.f18348b, this.f18349c);
                return;
            case 2:
                LocaleController.k(this.f18348b, this.f18349c);
                return;
            default:
                LocaleController.q(this.f18348b, this.f18349c);
                return;
        }
    }
}
