package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16892a;
    public final LocaleController f16893b;
    public final String f16894c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16892a = i10;
        this.f16893b = localeController;
        this.f16894c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16892a) {
            case 0:
                LocaleController.m(this.f16893b, this.f16894c, this.d);
                return;
            default:
                LocaleController.o(this.f16893b, this.f16894c, this.d);
                return;
        }
    }
}
