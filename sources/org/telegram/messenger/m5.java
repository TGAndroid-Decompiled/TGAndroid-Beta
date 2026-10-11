package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18527a;
    public final LocaleController f18528b;
    public final String f18529c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18527a = i10;
        this.f18528b = localeController;
        this.f18529c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18527a) {
            case 0:
                LocaleController.m(this.f18528b, this.f18529c, this.d);
                return;
            default:
                LocaleController.o(this.f18528b, this.f18529c, this.d);
                return;
        }
    }
}
