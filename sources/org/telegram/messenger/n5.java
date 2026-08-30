package org.telegram.messenger;
public final class n5 implements Runnable {
    public final int f17903a;
    public final LocaleController f17904b;
    public final String f17905c;
    public final Runnable d;

    public n5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f17903a = i10;
        this.f17904b = localeController;
        this.f17905c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17903a) {
            case 0:
                this.f17904b.lambda$checkForcePatchLangpack$6(this.f17905c, this.d);
                return;
            default:
                this.f17904b.lambda$checkForcePatchLangpack$5(this.f17905c, this.d);
                return;
        }
    }
}
