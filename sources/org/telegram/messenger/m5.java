package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f18493a;
    public final LocaleController f18494b;
    public final String f18495c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18493a = i10;
        this.f18494b = localeController;
        this.f18495c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                LocaleController.m(this.f18494b, this.f18495c, this.d);
                return;
            default:
                LocaleController.o(this.f18494b, this.f18495c, this.d);
                return;
        }
    }
}
