package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f21273a;
    public final LocaleController f21274b;
    public final String f21275c;
    public final Runnable d;

    public t5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f21273a = i10;
        this.f21274b = localeController;
        this.f21275c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21273a) {
            case 0:
                this.f21274b.lambda$checkForcePatchLangpack$6(this.f21275c, this.d);
                return;
            default:
                this.f21274b.lambda$checkForcePatchLangpack$5(this.f21275c, this.d);
                return;
        }
    }
}
