package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f21203a;
    public final LocaleController f21204b;
    public final String f21205c;
    public final Runnable d;

    public s5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f21203a = i10;
        this.f21204b = localeController;
        this.f21205c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21203a) {
            case 0:
                this.f21204b.lambda$checkForcePatchLangpack$6(this.f21205c, this.d);
                return;
            default:
                this.f21204b.lambda$checkForcePatchLangpack$5(this.f21205c, this.d);
                return;
        }
    }
}
