package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18532a;
    public final LocaleController f18533b;
    public final String f18534c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18532a = i10;
        this.f18533b = localeController;
        this.f18534c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18532a) {
            case 0:
                LocaleController.m(this.f18533b, this.f18534c, this.d);
                return;
            default:
                LocaleController.o(this.f18533b, this.f18534c, this.d);
                return;
        }
    }
}
