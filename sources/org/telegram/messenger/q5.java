package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f19317a;
    public final LocaleController f19318b;
    public final String f19319c;
    public final Runnable d;

    public q5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f19317a = i10;
        this.f19318b = localeController;
        this.f19319c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19317a) {
            case 0:
                this.f19318b.lambda$checkForcePatchLangpack$6(this.f19319c, this.d);
                return;
            default:
                this.f19318b.lambda$checkForcePatchLangpack$5(this.f19319c, this.d);
                return;
        }
    }
}
