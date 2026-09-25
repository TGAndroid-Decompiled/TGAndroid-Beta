package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16890a;
    public final LocaleController f16891b;
    public final String f16892c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16890a = i10;
        this.f16891b = localeController;
        this.f16892c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16890a) {
            case 0:
                this.f16891b.lambda$checkForcePatchLangpack$6(this.f16892c, this.d);
                return;
            default:
                this.f16891b.lambda$checkForcePatchLangpack$5(this.f16892c, this.d);
                return;
        }
    }
}
