package org.telegram.messenger;

public final class LocaleController$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LocaleController f$0;
    public final int f$1;

    public LocaleController$$ExternalSyntheticLambda8(LocaleController localeController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = localeController;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkUpdateForCurrentRemoteLocale$2(this.f$1);
                break;
            case 1:
                this.f$0.lambda$applyLanguage$8(this.f$1);
                break;
            case 2:
                this.f$0.lambda$checkPatchLangpack$4(this.f$1);
                break;
            default:
                this.f$0.lambda$checkUpdateForCurrentRemoteLocale$3(this.f$1);
                break;
        }
    }
}
