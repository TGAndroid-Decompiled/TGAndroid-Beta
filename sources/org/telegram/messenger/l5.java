package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f19233a;
    public final LocaleController f19234b;
    public final int f19235c;

    public l5(LocaleController localeController, int i10, int i11) {
        this.f19233a = i11;
        this.f19234b = localeController;
        this.f19235c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19233a) {
            case 0:
                LocaleController.u(this.f19234b, this.f19235c);
                return;
            case 1:
                LocaleController.h(this.f19234b, this.f19235c);
                return;
            case 2:
                LocaleController.k(this.f19234b, this.f19235c);
                return;
            default:
                LocaleController.q(this.f19234b, this.f19235c);
                return;
        }
    }
}
