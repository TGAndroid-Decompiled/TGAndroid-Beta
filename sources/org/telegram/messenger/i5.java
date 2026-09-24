package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f16609a;
    public final LocaleController f16610b;
    public final LocaleController.LocaleInfo f16611c;
    public final TLObject d;
    public final int e;
    public final Runnable f16612f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f16609a = i11;
        this.f16610b = localeController;
        this.f16611c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f16612f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16609a) {
            case 0:
                this.f16610b.lambda$applyRemoteLanguage$16(this.f16611c, this.d, this.e, this.f16612f);
                return;
            case 1:
                this.f16610b.lambda$applyRemoteLanguage$20(this.f16611c, this.d, this.e, this.f16612f);
                return;
            case 2:
                this.f16610b.lambda$applyRemoteLanguage$18(this.f16611c, this.d, this.e, this.f16612f);
                return;
            default:
                this.f16610b.lambda$applyRemoteLanguage$14(this.f16611c, this.d, this.e, this.f16612f);
                return;
        }
    }
}
