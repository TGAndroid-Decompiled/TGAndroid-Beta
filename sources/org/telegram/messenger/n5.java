package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f17878a;
    public final LocaleController f17879b;
    public final String f17880c;
    public final Runnable d;

    public n5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f17878a = i10;
        this.f17879b = localeController;
        this.f17880c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                this.f17879b.lambda$checkForcePatchLangpack$6(this.f17880c, this.d);
                return;
            default:
                this.f17879b.lambda$checkForcePatchLangpack$5(this.f17880c, this.d);
                return;
        }
    }
}
