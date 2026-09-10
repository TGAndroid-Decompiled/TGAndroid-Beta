package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f15930a;
    public final LocaleController f15931b;
    public final int f15932c;

    public o5(LocaleController localeController, int i10, int i11) {
        this.f15930a = i11;
        this.f15931b = localeController;
        this.f15932c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15930a) {
            case 0:
                LocaleController.u(this.f15931b, this.f15932c);
                return;
            case 1:
                LocaleController.h(this.f15931b, this.f15932c);
                return;
            case 2:
                LocaleController.k(this.f15931b, this.f15932c);
                return;
            default:
                LocaleController.q(this.f15931b, this.f15932c);
                return;
        }
    }
}
