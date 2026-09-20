package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f16610a;
    public final LocaleController f16611b;
    public final LocaleController.LocaleInfo f16612c;
    public final TLObject d;
    public final int e;
    public final Runnable f16613f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f16610a = i11;
        this.f16611b = localeController;
        this.f16612c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f16613f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16610a) {
            case 0:
                this.f16611b.lambda$applyRemoteLanguage$16(this.f16612c, this.d, this.e, this.f16613f);
                return;
            case 1:
                this.f16611b.lambda$applyRemoteLanguage$20(this.f16612c, this.d, this.e, this.f16613f);
                return;
            case 2:
                this.f16611b.lambda$applyRemoteLanguage$18(this.f16612c, this.d, this.e, this.f16613f);
                return;
            default:
                this.f16611b.lambda$applyRemoteLanguage$14(this.f16612c, this.d, this.e, this.f16613f);
                return;
        }
    }
}
