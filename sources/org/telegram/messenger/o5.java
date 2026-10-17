package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f19146a;
    public final LocaleController f19147b;
    public final String f19148c;
    public final Runnable d;

    public o5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19146a = i10;
        this.f19147b = localeController;
        this.f19148c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19146a) {
            case 0:
                this.f19147b.lambda$checkForcePatchLangpack$6(this.f19148c, this.d);
                return;
            default:
                this.f19147b.lambda$checkForcePatchLangpack$5(this.f19148c, this.d);
                return;
        }
    }
}
