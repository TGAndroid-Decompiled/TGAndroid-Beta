package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class LocaleController$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final LocaleController f$0;
    public final LocaleController.LocaleInfo f$1;
    public final TLObject f$2;
    public final int f$3;
    public final Runnable f$4;

    public LocaleController$$ExternalSyntheticLambda10(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i, Runnable runnable, int i2) {
        this.$r8$classId = i2;
        this.f$0 = localeController;
        this.f$1 = localeInfo;
        this.f$2 = tLObject;
        this.f$3 = i;
        this.f$4 = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyRemoteLanguage$16(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                this.f$0.lambda$applyRemoteLanguage$20(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 2:
                this.f$0.lambda$applyRemoteLanguage$18(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$applyRemoteLanguage$14(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
