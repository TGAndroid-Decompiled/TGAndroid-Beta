package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19356a;
    public final LocaleController f19357b;
    public final String f19358c;
    public final Runnable d;

    public r5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19356a = i10;
        this.f19357b = localeController;
        this.f19358c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19356a) {
            case 0:
                LocaleController.m(this.f19357b, this.f19358c, this.d);
                return;
            default:
                LocaleController.o(this.f19357b, this.f19358c, this.d);
                return;
        }
    }
}
