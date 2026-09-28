package org.telegram.messenger;
public final class l5 implements Runnable {
    public final int f16891a;
    public final LocaleController f16892b;
    public final String f16893c;
    public final Runnable d;

    public l5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f16891a = i10;
        this.f16892b = localeController;
        this.f16893c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16891a) {
            case 0:
                this.f16892b.lambda$checkForcePatchLangpack$6(this.f16893c, this.d);
                return;
            default:
                this.f16892b.lambda$checkForcePatchLangpack$5(this.f16893c, this.d);
                return;
        }
    }
}
