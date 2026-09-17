package org.telegram.messenger;
public final class k5 implements Runnable {
    public final int f18157a;
    public final LocaleController f18158b;
    public final String f18159c;
    public final Runnable d;

    public k5(LocaleController localeController, String str, Runnable runnable, int i10) {
        this.f18157a = i10;
        this.f18158b = localeController;
        this.f18159c = str;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18157a) {
            case 0:
                this.f18158b.lambda$checkForcePatchLangpack$6(this.f18159c, this.d);
                return;
            default:
                this.f18158b.lambda$checkForcePatchLangpack$5(this.f18159c, this.d);
                return;
        }
    }
}
