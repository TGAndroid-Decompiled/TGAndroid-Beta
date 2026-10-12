package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18533a;
    public final LocaleController f18534b;
    public final String f18535c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18533a = i10;
        this.f18534b = localeController;
        this.f18535c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18533a) {
            case 0:
                LocaleController.m(this.f18534b, this.f18535c, this.d);
                return;
            default:
                LocaleController.o(this.f18534b, this.f18535c, this.d);
                return;
        }
    }
}
