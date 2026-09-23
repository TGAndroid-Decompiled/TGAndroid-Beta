package org.telegram.messenger;
public final class j5 implements Runnable {
    public final int f16443a;
    public final LocaleController f16444b;
    public final int f16445c;

    public j5(LocaleController localeController, int i10, int i11) {
        this.f16443a = i11;
        this.f16444b = localeController;
        this.f16445c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16443a) {
            case 0:
                LocaleController.u(this.f16444b, this.f16445c);
                return;
            case 1:
                LocaleController.h(this.f16444b, this.f16445c);
                return;
            case 2:
                LocaleController.k(this.f16444b, this.f16445c);
                return;
            default:
                LocaleController.q(this.f16444b, this.f16445c);
                return;
        }
    }
}
