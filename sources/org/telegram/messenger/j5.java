package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f18223a;
    public final LocaleController f18224b;
    public final int f18225c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f18223a = i11;
        this.f18224b = localeController;
        this.f18225c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18223a) {
            case 0:
                LocaleController.u(this.f18224b, this.f18225c);
                return;
            case 1:
                LocaleController.h(this.f18224b, this.f18225c);
                return;
            case 2:
                LocaleController.k(this.f18224b, this.f18225c);
                return;
            default:
                LocaleController.q(this.f18224b, this.f18225c);
                return;
        }
    }
}
