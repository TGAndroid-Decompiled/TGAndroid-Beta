package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class h5 implements Runnable {
    public final int f17883a;
    public final LocaleController f17884b;
    public final LocaleController.LocaleInfo f17885c;
    public final TLObject d;
    public final int f17886e;
    public final Runnable f17887f;

    public h5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17883a = i11;
        this.f17884b = localeController;
        this.f17885c = localeInfo;
        this.d = tLObject;
        this.f17886e = i10;
        this.f17887f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17883a) {
            case 0:
                this.f17884b.lambda$applyRemoteLanguage$16(this.f17885c, this.d, this.f17886e, this.f17887f);
                return;
            case 1:
                this.f17884b.lambda$applyRemoteLanguage$20(this.f17885c, this.d, this.f17886e, this.f17887f);
                return;
            case 2:
                this.f17884b.lambda$applyRemoteLanguage$18(this.f17885c, this.d, this.f17886e, this.f17887f);
                return;
            default:
                this.f17884b.lambda$applyRemoteLanguage$14(this.f17885c, this.d, this.f17886e, this.f17887f);
                return;
        }
    }
}
