package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16643a;
    public final LocaleController f16644b;
    public final String f16645c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16643a = i10;
        this.f16644b = localeController;
        this.f16645c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16643a) {
            case 0:
                LocaleController.m(this.f16644b, this.f16645c, this.d);
                return;
            default:
                LocaleController.o(this.f16644b, this.f16645c, this.d);
                return;
        }
    }
}
