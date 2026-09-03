package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f19429a;
    public final LocaleController f19430b;
    public final String f19431c;
    public final Runnable d;

    public n5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19429a = i10;
        this.f19430b = localeController;
        this.f19431c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19429a) {
            case 0:
                LocaleController.m(this.f19430b, this.f19431c, this.d);
                return;
            default:
                LocaleController.o(this.f19430b, this.f19431c, this.d);
                return;
        }
    }
}
