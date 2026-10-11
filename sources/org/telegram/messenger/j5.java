package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class j5 implements Runnable {
    public final int f18229a;
    public final LocaleController f18230b;
    public final LocaleController.LocaleInfo f18231c;
    public final TLObject d;
    public final int f18232e;
    public final Runnable f18233f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18229a = i11;
        this.f18230b = localeController;
        this.f18231c = localeInfo;
        this.d = tLObject;
        this.f18232e = i10;
        this.f18233f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18229a) {
            case 0:
                this.f18230b.lambda$applyRemoteLanguage$16(this.f18231c, this.d, this.f18232e, this.f18233f);
                return;
            case 1:
                this.f18230b.lambda$applyRemoteLanguage$20(this.f18231c, this.d, this.f18232e, this.f18233f);
                return;
            case 2:
                this.f18230b.lambda$applyRemoteLanguage$18(this.f18231c, this.d, this.f18232e, this.f18233f);
                return;
            default:
                this.f18230b.lambda$applyRemoteLanguage$14(this.f18231c, this.d, this.f18232e, this.f18233f);
                return;
        }
    }
}
