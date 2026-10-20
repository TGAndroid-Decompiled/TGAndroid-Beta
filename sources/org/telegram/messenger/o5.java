package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19111a;
    public final LocaleController f19112b;
    public final int f19113c;

    public o5(LocaleController localeController, int i10, int i11) {
        this.f19111a = i11;
        this.f19112b = localeController;
        this.f19113c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                LocaleController.u(this.f19112b, this.f19113c);
                return;
            case 1:
                LocaleController.h(this.f19112b, this.f19113c);
                return;
            case 2:
                LocaleController.k(this.f19112b, this.f19113c);
                return;
            default:
                LocaleController.q(this.f19112b, this.f19113c);
                return;
        }
    }
}
