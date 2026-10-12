package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18069a;
    public final LocaleController f18070b;
    public final String f18071c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18069a = i10;
        this.f18070b = localeController;
        this.f18071c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18069a) {
            case 0:
                LocaleController.m(this.f18070b, this.f18071c, this.d);
                return;
            default:
                LocaleController.o(this.f18070b, this.f18071c, this.d);
                return;
        }
    }
}
