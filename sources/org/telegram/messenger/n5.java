package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f19017a;
    public final LocaleController f19018b;
    public final int f19019c;

    public n5(LocaleController localeController, int i10, int i11) {
        this.f19017a = i11;
        this.f19018b = localeController;
        this.f19019c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19017a) {
            case 0:
                LocaleController.u(this.f19018b, this.f19019c);
                return;
            case 1:
                LocaleController.h(this.f19018b, this.f19019c);
                return;
            case 2:
                LocaleController.k(this.f19018b, this.f19019c);
                return;
            default:
                LocaleController.q(this.f19018b, this.f19019c);
                return;
        }
    }
}
