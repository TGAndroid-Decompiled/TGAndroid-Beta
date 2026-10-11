package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18491a;
    public final LocaleController f18492b;
    public final String f18493c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18491a = i10;
        this.f18492b = localeController;
        this.f18493c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18491a) {
            case 0:
                LocaleController.m(this.f18492b, this.f18493c, this.d);
                return;
            default:
                LocaleController.o(this.f18492b, this.f18493c, this.d);
                return;
        }
    }
}
