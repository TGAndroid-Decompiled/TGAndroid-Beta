package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f19320a;
    public final LocaleController f19321b;
    public final String f19322c;
    public final Runnable d;

    public q5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19320a = i10;
        this.f19321b = localeController;
        this.f19322c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19320a) {
            case 0:
                this.f19321b.lambda$checkForcePatchLangpack$6(this.f19322c, this.d);
                return;
            default:
                this.f19321b.lambda$checkForcePatchLangpack$5(this.f19322c, this.d);
                return;
        }
    }
}
