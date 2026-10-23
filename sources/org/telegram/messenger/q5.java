package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f19354a;
    public final LocaleController f19355b;
    public final String f19356c;
    public final Runnable d;

    public q5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19354a = i10;
        this.f19355b = localeController;
        this.f19356c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19354a) {
            case 0:
                LocaleController.m(this.f19355b, this.f19356c, this.d);
                return;
            default:
                LocaleController.o(this.f19355b, this.f19356c, this.d);
                return;
        }
    }
}
