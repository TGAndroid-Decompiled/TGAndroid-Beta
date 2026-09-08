package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f18055a;
    public final LocaleController f18056b;
    public final int f18057c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f18055a = i11;
        this.f18056b = localeController;
        this.f18057c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                LocaleController.u(this.f18056b, this.f18057c);
                return;
            case 1:
                LocaleController.h(this.f18056b, this.f18057c);
                return;
            case 2:
                LocaleController.k(this.f18056b, this.f18057c);
                return;
            default:
                LocaleController.q(this.f18056b, this.f18057c);
                return;
        }
    }
}
