package org.telegram.messenger;
public final class m5 implements Runnable {
    public final int f20918a;
    public final LocaleController f20919b;
    public final String f20920c;
    public final Runnable d;

    public m5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f20918a = i10;
        this.f20919b = localeController;
        this.f20920c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20918a) {
            case 0:
                this.f20919b.lambda$checkForcePatchLangpack$6(this.f20920c, this.d);
                return;
            default:
                this.f20919b.lambda$checkForcePatchLangpack$5(this.f20920c, this.d);
                return;
        }
    }
}
