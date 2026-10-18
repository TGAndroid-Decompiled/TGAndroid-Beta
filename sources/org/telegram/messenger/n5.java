package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f19014a;
    public final LocaleController f19015b;
    public final int f19016c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f19014a = i11;
        this.f19015b = localeController;
        this.f19016c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19014a) {
            case 0:
                LocaleController.u(this.f19015b, this.f19016c);
                return;
            case 1:
                LocaleController.h(this.f19015b, this.f19016c);
                return;
            case 2:
                LocaleController.k(this.f19015b, this.f19016c);
                return;
            default:
                LocaleController.q(this.f19015b, this.f19016c);
                return;
        }
    }
}
