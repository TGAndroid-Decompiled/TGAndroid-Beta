package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class j5 implements Runnable {
    public final int f20632a;
    public final LocaleController f20633b;
    public final LocaleController.LocaleInfo f20634c;
    public final TLObject d;
    public final int f20635e;
    public final Runnable f20636f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f20632a = i11;
        this.f20633b = localeController;
        this.f20634c = localeInfo;
        this.d = tLObject;
        this.f20635e = i10;
        this.f20636f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20632a) {
            case 0:
                this.f20633b.lambda$applyRemoteLanguage$16(this.f20634c, this.d, this.f20635e, this.f20636f);
                return;
            case 1:
                this.f20633b.lambda$applyRemoteLanguage$20(this.f20634c, this.d, this.f20635e, this.f20636f);
                return;
            case 2:
                this.f20633b.lambda$applyRemoteLanguage$18(this.f20634c, this.d, this.f20635e, this.f20636f);
                return;
            default:
                this.f20633b.lambda$applyRemoteLanguage$14(this.f20634c, this.d, this.f20635e, this.f20636f);
                return;
        }
    }
}
