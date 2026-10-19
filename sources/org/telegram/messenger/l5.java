package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class l5 implements Runnable {
    public final int f18841a;
    public final LocaleController f18842b;
    public final LocaleController.LocaleInfo f18843c;
    public final TLObject d;
    public final int e;
    public final Runnable f18844f;

    public l5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18841a = i11;
        this.f18842b = localeController;
        this.f18843c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f18844f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18841a) {
            case 0:
                this.f18842b.lambda$applyRemoteLanguage$16(this.f18843c, this.d, this.e, this.f18844f);
                return;
            case 1:
                this.f18842b.lambda$applyRemoteLanguage$20(this.f18843c, this.d, this.e, this.f18844f);
                return;
            case 2:
                this.f18842b.lambda$applyRemoteLanguage$18(this.f18843c, this.d, this.e, this.f18844f);
                return;
            default:
                this.f18842b.lambda$applyRemoteLanguage$14(this.f18843c, this.d, this.e, this.f18844f);
                return;
        }
    }
}
