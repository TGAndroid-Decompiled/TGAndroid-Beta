package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19148a;
    public final LocaleController f19149b;
    public final String f19150c;
    public final Runnable d;

    public o5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19148a = i10;
        this.f19149b = localeController;
        this.f19150c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19148a) {
            case 0:
                LocaleController.m(this.f19149b, this.f19150c, this.d);
                return;
            default:
                LocaleController.o(this.f19149b, this.f19150c, this.d);
                return;
        }
    }
}
