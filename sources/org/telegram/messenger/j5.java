package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f18228a;
    public final LocaleController f18229b;
    public final int f18230c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f18228a = i11;
        this.f18229b = localeController;
        this.f18230c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18228a) {
            case 0:
                LocaleController.u(this.f18229b, this.f18230c);
                return;
            case 1:
                LocaleController.h(this.f18229b, this.f18230c);
                return;
            case 2:
                LocaleController.k(this.f18229b, this.f18230c);
                return;
            default:
                LocaleController.q(this.f18229b, this.f18230c);
                return;
        }
    }
}
