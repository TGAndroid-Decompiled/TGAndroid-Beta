package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f16109a;
    public final LocaleController f16110b;
    public final String f16111c;
    public final Runnable d;

    public q5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16109a = i10;
        this.f16110b = localeController;
        this.f16111c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16109a) {
            case 0:
                this.f16110b.lambda$checkForcePatchLangpack$6(this.f16111c, this.d);
                return;
            default:
                this.f16110b.lambda$checkForcePatchLangpack$5(this.f16111c, this.d);
                return;
        }
    }
}
