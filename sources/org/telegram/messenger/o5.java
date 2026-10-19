package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19145a;
    public final LocaleController f19146b;
    public final String f19147c;
    public final Runnable d;

    public o5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19145a = i10;
        this.f19146b = localeController;
        this.f19147c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19145a) {
            case 0:
                LocaleController.m(this.f19146b, this.f19147c, this.d);
                return;
            default:
                LocaleController.o(this.f19146b, this.f19147c, this.d);
                return;
        }
    }
}
