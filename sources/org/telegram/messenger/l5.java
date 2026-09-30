package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16908a;
    public final LocaleController f16909b;
    public final String f16910c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16908a = i10;
        this.f16909b = localeController;
        this.f16910c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16908a) {
            case 0:
                this.f16909b.lambda$checkForcePatchLangpack$6(this.f16910c, this.d);
                return;
            default:
                this.f16909b.lambda$checkForcePatchLangpack$5(this.f16910c, this.d);
                return;
        }
    }
}
