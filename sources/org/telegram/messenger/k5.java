package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18184a;
    public final LocaleController f18185b;
    public final String f18186c;
    public final Runnable d;

    public k5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18184a = i10;
        this.f18185b = localeController;
        this.f18186c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18184a) {
            case 0:
                LocaleController.m(this.f18185b, this.f18186c, this.d);
                return;
            default:
                LocaleController.o(this.f18185b, this.f18186c, this.d);
                return;
        }
    }
}
