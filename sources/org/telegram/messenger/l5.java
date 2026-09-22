package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16877a;
    public final LocaleController f16878b;
    public final String f16879c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16877a = i10;
        this.f16878b = localeController;
        this.f16879c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16877a) {
            case 0:
                LocaleController.m(this.f16878b, this.f16879c, this.d);
                return;
            default:
                LocaleController.o(this.f16878b, this.f16879c, this.d);
                return;
        }
    }
}
