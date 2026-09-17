package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16652a;
    public final LocaleController f16653b;
    public final String f16654c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16652a = i10;
        this.f16653b = localeController;
        this.f16654c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16652a) {
            case 0:
                LocaleController.m(this.f16653b, this.f16654c, this.d);
                return;
            default:
                LocaleController.o(this.f16653b, this.f16654c, this.d);
                return;
        }
    }
}
