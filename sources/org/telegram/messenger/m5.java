package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18489a;
    public final LocaleController f18490b;
    public final String f18491c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18489a = i10;
        this.f18490b = localeController;
        this.f18491c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18489a) {
            case 0:
                LocaleController.m(this.f18490b, this.f18491c, this.d);
                return;
            default:
                LocaleController.o(this.f18490b, this.f18491c, this.d);
                return;
        }
    }
}
