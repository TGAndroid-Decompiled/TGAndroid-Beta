package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16466a;
    public final LocaleController f16467b;
    public final int f16468c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16466a = i11;
        this.f16467b = localeController;
        this.f16468c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16466a) {
            case 0:
                LocaleController.u(this.f16467b, this.f16468c);
                return;
            case 1:
                LocaleController.h(this.f16467b, this.f16468c);
                return;
            case 2:
                LocaleController.k(this.f16467b, this.f16468c);
                return;
            default:
                LocaleController.q(this.f16467b, this.f16468c);
                return;
        }
    }
}
