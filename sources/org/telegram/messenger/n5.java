package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f19427a;
    public final LocaleController f19428b;
    public final String f19429c;
    public final Runnable d;

    public n5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19427a = i10;
        this.f19428b = localeController;
        this.f19429c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19427a) {
            case 0:
                this.f19428b.lambda$checkForcePatchLangpack$6(this.f19429c, this.d);
                return;
            default:
                this.f19428b.lambda$checkForcePatchLangpack$5(this.f19429c, this.d);
                return;
        }
    }
}
