package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18432a;
    public final LocaleController f18433b;
    public final String f18434c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18432a = i10;
        this.f18433b = localeController;
        this.f18434c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18432a) {
            case 0:
                LocaleController.m(this.f18433b, this.f18434c, this.d);
                return;
            default:
                LocaleController.o(this.f18433b, this.f18434c, this.d);
                return;
        }
    }
}
