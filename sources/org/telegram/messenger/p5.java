package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17769a;
    public final LocaleController f17770b;
    public final String f17771c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f17769a = i10;
        this.f17770b = localeController;
        this.f17771c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17769a) {
            case 0:
                LocaleController.m(this.f17770b, this.f17771c, this.d);
                return;
            default:
                LocaleController.o(this.f17770b, this.f17771c, this.d);
                return;
        }
    }
}
