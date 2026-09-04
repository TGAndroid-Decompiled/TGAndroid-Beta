package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18237a;
    public final LocaleController f18238b;
    public final String f18239c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18237a = i10;
        this.f18238b = localeController;
        this.f18239c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18237a) {
            case 0:
                LocaleController.m(this.f18238b, this.f18239c, this.d);
                return;
            default:
                LocaleController.o(this.f18238b, this.f18239c, this.d);
                return;
        }
    }
}
