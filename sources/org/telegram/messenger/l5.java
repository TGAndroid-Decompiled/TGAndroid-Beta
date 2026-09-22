package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16639a;
    public final LocaleController f16640b;
    public final String f16641c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16639a = i10;
        this.f16640b = localeController;
        this.f16641c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16639a) {
            case 0:
                this.f16640b.lambda$checkForcePatchLangpack$6(this.f16641c, this.d);
                return;
            default:
                this.f16640b.lambda$checkForcePatchLangpack$5(this.f16641c, this.d);
                return;
        }
    }
}
