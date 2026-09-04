package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f18028a;
    public final LocaleController f18029b;
    public final int f18030c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f18028a = i11;
        this.f18029b = localeController;
        this.f18030c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18028a) {
            case 0:
                LocaleController.u(this.f18029b, this.f18030c);
                return;
            case 1:
                LocaleController.h(this.f18029b, this.f18030c);
                return;
            case 2:
                LocaleController.k(this.f18029b, this.f18030c);
                return;
            default:
                LocaleController.q(this.f18029b, this.f18030c);
                return;
        }
    }
}
