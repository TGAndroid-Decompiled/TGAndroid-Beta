package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19108a;
    public final LocaleController f19109b;
    public final int f19110c;

    public o5(LocaleController localeController, int i10, int i11) {
        this.f19108a = i11;
        this.f19109b = localeController;
        this.f19110c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                LocaleController.u(this.f19109b, this.f19110c);
                return;
            case 1:
                LocaleController.h(this.f19109b, this.f19110c);
                return;
            case 2:
                LocaleController.k(this.f19109b, this.f19110c);
                return;
            default:
                LocaleController.q(this.f19109b, this.f19110c);
                return;
        }
    }
}
