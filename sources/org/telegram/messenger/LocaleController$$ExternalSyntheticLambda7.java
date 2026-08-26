package org.telegram.messenger;

public final class LocaleController$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final LocaleController f$0;
    public final String f$1;
    public final Runnable f$2;

    public LocaleController$$ExternalSyntheticLambda7(LocaleController localeController, String str, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = localeController;
        this.f$1 = str;
        this.f$2 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkForcePatchLangpack$5(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$checkForcePatchLangpack$6(this.f$1, this.f$2);
                break;
        }
    }
}
