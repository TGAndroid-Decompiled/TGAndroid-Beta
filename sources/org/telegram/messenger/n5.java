package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f18346a;
    public final LocaleController f18347b;
    public final int f18348c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f18346a = i11;
        this.f18347b = localeController;
        this.f18348c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18346a) {
            case 0:
                LocaleController.u(this.f18347b, this.f18348c);
                return;
            case 1:
                LocaleController.h(this.f18347b, this.f18348c);
                return;
            case 2:
                LocaleController.k(this.f18347b, this.f18348c);
                return;
            default:
                LocaleController.q(this.f18347b, this.f18348c);
                return;
        }
    }
}
