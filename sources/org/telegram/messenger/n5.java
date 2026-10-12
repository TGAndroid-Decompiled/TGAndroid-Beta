package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f17921a;
    public final LocaleController f17922b;
    public final int f17923c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f17921a = i11;
        this.f17922b = localeController;
        this.f17923c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                LocaleController.u(this.f17922b, this.f17923c);
                return;
            case 1:
                LocaleController.h(this.f17922b, this.f17923c);
                return;
            case 2:
                LocaleController.k(this.f17922b, this.f17923c);
                return;
            default:
                LocaleController.q(this.f17922b, this.f17923c);
                return;
        }
    }
}
