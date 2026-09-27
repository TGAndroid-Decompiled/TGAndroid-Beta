package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16884a;
    public final LocaleController f16885b;
    public final String f16886c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16884a = i10;
        this.f16885b = localeController;
        this.f16886c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16884a) {
            case 0:
                LocaleController.m(this.f16885b, this.f16886c, this.d);
                return;
            default:
                LocaleController.o(this.f16885b, this.f16886c, this.d);
                return;
        }
    }
}
