package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18264a;
    public final LocaleController f18265b;
    public final String f18266c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18264a = i10;
        this.f18265b = localeController;
        this.f18266c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18264a) {
            case 0:
                LocaleController.m(this.f18265b, this.f18266c, this.d);
                return;
            default:
                LocaleController.o(this.f18265b, this.f18266c, this.d);
                return;
        }
    }
}
