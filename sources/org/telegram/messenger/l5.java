package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16632a;
    public final LocaleController f16633b;
    public final String f16634c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16632a = i10;
        this.f16633b = localeController;
        this.f16634c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16632a) {
            case 0:
                this.f16633b.lambda$checkForcePatchLangpack$6(this.f16634c, this.d);
                return;
            default:
                this.f16633b.lambda$checkForcePatchLangpack$5(this.f16634c, this.d);
                return;
        }
    }
}
