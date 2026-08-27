package org.telegram.messenger;

public final class k5 implements Runnable {

    public final int f20737a;

    public final LocaleController f20738b;

    public final int f20739c;

    public k5(LocaleController localeController, int i10, int i11) {
        this.f20737a = i11;
        this.f20738b = localeController;
        this.f20739c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20737a) {
            case 0:
                this.f20738b.lambda$applyLanguage$8(this.f20739c);
                break;
            case 1:
                this.f20738b.lambda$checkPatchLangpack$4(this.f20739c);
                break;
            case 2:
                this.f20738b.lambda$checkUpdateForCurrentRemoteLocale$2(this.f20739c);
                break;
            default:
                this.f20738b.lambda$checkUpdateForCurrentRemoteLocale$3(this.f20739c);
                break;
        }
    }
}
