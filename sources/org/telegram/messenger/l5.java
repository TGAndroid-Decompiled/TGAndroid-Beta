package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f19235a;
    public final LocaleController f19236b;
    public final int f19237c;

    public l5(LocaleController localeController, int i10, int i11) {
        this.f19235a = i11;
        this.f19236b = localeController;
        this.f19237c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                LocaleController.u(this.f19236b, this.f19237c);
                return;
            case 1:
                LocaleController.h(this.f19236b, this.f19237c);
                return;
            case 2:
                LocaleController.k(this.f19236b, this.f19237c);
                return;
            default:
                LocaleController.q(this.f19236b, this.f19237c);
                return;
        }
    }
}
