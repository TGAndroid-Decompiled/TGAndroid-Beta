package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f19225a;
    public final LocaleController f19226b;
    public final String f19227c;
    public final Runnable d;

    public p5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19225a = i10;
        this.f19226b = localeController;
        this.f19227c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19225a) {
            case 0:
                this.f19226b.lambda$checkForcePatchLangpack$6(this.f19227c, this.d);
                return;
            default:
                this.f19226b.lambda$checkForcePatchLangpack$5(this.f19227c, this.d);
                return;
        }
    }
}
