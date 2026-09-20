package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16862a;
    public final LocaleController f16863b;
    public final String f16864c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16862a = i10;
        this.f16863b = localeController;
        this.f16864c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16862a) {
            case 0:
                this.f16863b.lambda$checkForcePatchLangpack$6(this.f16864c, this.d);
                return;
            default:
                this.f16863b.lambda$checkForcePatchLangpack$5(this.f16864c, this.d);
                return;
        }
    }
}
