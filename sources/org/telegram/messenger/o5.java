package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19107a;
    public final LocaleController f19108b;
    public final int f19109c;

    public o5(LocaleController localeController, int i10, int i11) {
        this.f19107a = i11;
        this.f19108b = localeController;
        this.f19109c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                LocaleController.u(this.f19108b, this.f19109c);
                return;
            case 1:
                LocaleController.h(this.f19108b, this.f19109c);
                return;
            case 2:
                LocaleController.k(this.f19108b, this.f19109c);
                return;
            default:
                LocaleController.q(this.f19108b, this.f19109c);
                return;
        }
    }
}
