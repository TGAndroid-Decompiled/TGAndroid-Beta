package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f20754a;
    public final LocaleController f20755b;
    public final String f20756c;
    public final Runnable d;

    public k5(LocaleController localeController, String str, Runnable runnable, int i9) {
        this.f20754a = i9;
        this.f20755b = localeController;
        this.f20756c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20754a) {
            case 0:
                this.f20755b.lambda$checkForcePatchLangpack$6(this.f20756c, this.d);
                return;
            default:
                this.f20755b.lambda$checkForcePatchLangpack$5(this.f20756c, this.d);
                return;
        }
    }
}
