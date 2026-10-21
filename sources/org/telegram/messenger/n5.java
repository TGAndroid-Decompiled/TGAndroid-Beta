package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class n5 implements Runnable {
    public final int f19012a;
    public final LocaleController f19013b;
    public final LocaleController.LocaleInfo f19014c;
    public final TLObject d;
    public final int e;
    public final Runnable f19015f;

    public n5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f19012a = i11;
        this.f19013b = localeController;
        this.f19014c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f19015f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19012a) {
            case 0:
                this.f19013b.lambda$applyRemoteLanguage$16(this.f19014c, this.d, this.e, this.f19015f);
                return;
            case 1:
                this.f19013b.lambda$applyRemoteLanguage$20(this.f19014c, this.d, this.e, this.f19015f);
                return;
            case 2:
                this.f19013b.lambda$applyRemoteLanguage$18(this.f19014c, this.d, this.e, this.f19015f);
                return;
            default:
                this.f19013b.lambda$applyRemoteLanguage$14(this.f19014c, this.d, this.e, this.f19015f);
                return;
        }
    }
}
