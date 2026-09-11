package org.telegram.messenger;
public final class i5 implements Runnable {
    public final int f17951a;
    public final LocaleController f17952b;
    public final int f17953c;

    public i5(LocaleController localeController, int i10, int i11) {
        this.f17951a = i11;
        this.f17952b = localeController;
        this.f17953c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17951a) {
            case 0:
                LocaleController.u(this.f17952b, this.f17953c);
                return;
            case 1:
                LocaleController.h(this.f17952b, this.f17953c);
                return;
            case 2:
                LocaleController.k(this.f17952b, this.f17953c);
                return;
            default:
                LocaleController.q(this.f17952b, this.f17953c);
                return;
        }
    }
}
