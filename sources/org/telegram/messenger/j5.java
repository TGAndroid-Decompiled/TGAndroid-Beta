package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class j5 implements Runnable {
    public final int f18224a;
    public final LocaleController f18225b;
    public final LocaleController.LocaleInfo f18226c;
    public final TLObject d;
    public final int f18227e;
    public final Runnable f18228f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18224a = i11;
        this.f18225b = localeController;
        this.f18226c = localeInfo;
        this.d = tLObject;
        this.f18227e = i10;
        this.f18228f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18224a) {
            case 0:
                this.f18225b.lambda$applyRemoteLanguage$16(this.f18226c, this.d, this.f18227e, this.f18228f);
                return;
            case 1:
                this.f18225b.lambda$applyRemoteLanguage$20(this.f18226c, this.d, this.f18227e, this.f18228f);
                return;
            case 2:
                this.f18225b.lambda$applyRemoteLanguage$18(this.f18226c, this.d, this.f18227e, this.f18228f);
                return;
            default:
                this.f18225b.lambda$applyRemoteLanguage$14(this.f18226c, this.d, this.f18227e, this.f18228f);
                return;
        }
    }
}
