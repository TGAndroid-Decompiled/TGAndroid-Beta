package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f19222a;
    public final LocaleController f19223b;
    public final String f19224c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19222a = i10;
        this.f19223b = localeController;
        this.f19224c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19222a) {
            case 0:
                this.f19223b.lambda$checkForcePatchLangpack$6(this.f19224c, this.d);
                return;
            default:
                this.f19223b.lambda$checkForcePatchLangpack$5(this.f19224c, this.d);
                return;
        }
    }
}
