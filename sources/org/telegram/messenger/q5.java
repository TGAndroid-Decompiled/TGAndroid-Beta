package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f19284a;
    public final LocaleController f19285b;
    public final String f19286c;
    public final Runnable d;

    public q5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19284a = i10;
        this.f19285b = localeController;
        this.f19286c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                LocaleController.m(this.f19285b, this.f19286c, this.d);
                return;
            default:
                LocaleController.o(this.f19285b, this.f19286c, this.d);
                return;
        }
    }
}
