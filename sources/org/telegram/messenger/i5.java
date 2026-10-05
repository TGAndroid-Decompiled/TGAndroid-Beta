package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f18124a;
    public final LocaleController f18125b;
    public final LocaleController.LocaleInfo f18126c;
    public final TLObject d;
    public final int f18127e;
    public final Runnable f18128f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18124a = i11;
        this.f18125b = localeController;
        this.f18126c = localeInfo;
        this.d = tLObject;
        this.f18127e = i10;
        this.f18128f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18124a) {
            case 0:
                this.f18125b.lambda$applyRemoteLanguage$16(this.f18126c, this.d, this.f18127e, this.f18128f);
                return;
            case 1:
                this.f18125b.lambda$applyRemoteLanguage$20(this.f18126c, this.d, this.f18127e, this.f18128f);
                return;
            case 2:
                this.f18125b.lambda$applyRemoteLanguage$18(this.f18126c, this.d, this.f18127e, this.f18128f);
                return;
            default:
                this.f18125b.lambda$applyRemoteLanguage$14(this.f18126c, this.d, this.f18127e, this.f18128f);
                return;
        }
    }
}
