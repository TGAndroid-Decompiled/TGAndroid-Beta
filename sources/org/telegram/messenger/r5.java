package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19426a;
    public final LocaleController f19427b;
    public final String f19428c;
    public final Runnable d;

    public r5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19426a = i10;
        this.f19427b = localeController;
        this.f19428c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19426a) {
            case 0:
                LocaleController.m(this.f19427b, this.f19428c, this.d);
                return;
            default:
                LocaleController.o(this.f19427b, this.f19428c, this.d);
                return;
        }
    }
}
