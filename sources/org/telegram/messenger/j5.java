package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16453a;
    public final LocaleController f16454b;
    public final int f16455c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16453a = i11;
        this.f16454b = localeController;
        this.f16455c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16453a) {
            case 0:
                LocaleController.u(this.f16454b, this.f16455c);
                return;
            case 1:
                LocaleController.h(this.f16454b, this.f16455c);
                return;
            case 2:
                LocaleController.k(this.f16454b, this.f16455c);
                return;
            default:
                LocaleController.q(this.f16454b, this.f16455c);
                return;
        }
    }
}
