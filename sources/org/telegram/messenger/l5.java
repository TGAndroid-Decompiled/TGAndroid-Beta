package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f18427a;
    public final LocaleController f18428b;
    public final String f18429c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18427a = i10;
        this.f18428b = localeController;
        this.f18429c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18427a) {
            case 0:
                this.f18428b.lambda$checkForcePatchLangpack$6(this.f18429c, this.d);
                return;
            default:
                this.f18428b.lambda$checkForcePatchLangpack$5(this.f18429c, this.d);
                return;
        }
    }
}
