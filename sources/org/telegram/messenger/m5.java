package org.telegram.messenger;

public final class m5 implements Runnable {

    public final int f20939a;

    public final LocaleController f20940b;

    public final String f20941c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f20939a = i10;
        this.f20940b = localeController;
        this.f20941c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20939a) {
            case 0:
                this.f20940b.lambda$checkForcePatchLangpack$6(this.f20941c, this.d);
                break;
            default:
                this.f20940b.lambda$checkForcePatchLangpack$5(this.f20941c, this.d);
                break;
        }
    }
}
