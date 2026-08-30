package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class k5 implements Runnable {
    public final int f17631a;
    public final LocaleController f17632b;
    public final LocaleController.LocaleInfo f17633c;
    public final TLObject d;
    public final int e;
    public final Runnable f17634f;

    public k5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17631a = i11;
        this.f17632b = localeController;
        this.f17633c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f17634f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17631a) {
            case 0:
                this.f17632b.lambda$applyRemoteLanguage$16(this.f17633c, this.d, this.e, this.f17634f);
                return;
            case 1:
                this.f17632b.lambda$applyRemoteLanguage$20(this.f17633c, this.d, this.e, this.f17634f);
                return;
            case 2:
                this.f17632b.lambda$applyRemoteLanguage$18(this.f17633c, this.d, this.e, this.f17634f);
                return;
            default:
                this.f17632b.lambda$applyRemoteLanguage$14(this.f17633c, this.d, this.e, this.f17634f);
                return;
        }
    }
}
