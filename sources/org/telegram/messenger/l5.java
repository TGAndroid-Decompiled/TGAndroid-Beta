package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18434a;
    public final LocaleController f18435b;
    public final String f18436c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18434a = i10;
        this.f18435b = localeController;
        this.f18436c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18434a) {
            case 0:
                LocaleController.m(this.f18435b, this.f18436c, this.d);
                return;
            default:
                LocaleController.o(this.f18435b, this.f18436c, this.d);
                return;
        }
    }
}
