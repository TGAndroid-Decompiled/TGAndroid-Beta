package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18435a;
    public final LocaleController f18436b;
    public final String f18437c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18435a = i10;
        this.f18436b = localeController;
        this.f18437c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                LocaleController.m(this.f18436b, this.f18437c, this.d);
                return;
            default:
                LocaleController.o(this.f18436b, this.f18437c, this.d);
                return;
        }
    }
}
