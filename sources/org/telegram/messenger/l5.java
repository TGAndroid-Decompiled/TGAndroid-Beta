package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16820a;
    public final LocaleController f16821b;
    public final String f16822c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16820a = i10;
        this.f16821b = localeController;
        this.f16822c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16820a) {
            case 0:
                LocaleController.m(this.f16821b, this.f16822c, this.d);
                return;
            default:
                LocaleController.o(this.f16821b, this.f16822c, this.d);
                return;
        }
    }
}
