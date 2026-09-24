package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16875a;
    public final LocaleController f16876b;
    public final String f16877c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16875a = i10;
        this.f16876b = localeController;
        this.f16877c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16875a) {
            case 0:
                this.f16876b.lambda$checkForcePatchLangpack$6(this.f16877c, this.d);
                return;
            default:
                this.f16876b.lambda$checkForcePatchLangpack$5(this.f16877c, this.d);
                return;
        }
    }
}
