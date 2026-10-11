package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class j5 implements Runnable {
    public final int f18265a;
    public final LocaleController f18266b;
    public final LocaleController.LocaleInfo f18267c;
    public final TLObject d;
    public final int f18268e;
    public final Runnable f18269f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18265a = i11;
        this.f18266b = localeController;
        this.f18267c = localeInfo;
        this.d = tLObject;
        this.f18268e = i10;
        this.f18269f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$applyRemoteLanguage$16(this.f18267c, this.d, this.f18268e, this.f18269f);
                return;
            case 1:
                this.f18266b.lambda$applyRemoteLanguage$20(this.f18267c, this.d, this.f18268e, this.f18269f);
                return;
            case 2:
                this.f18266b.lambda$applyRemoteLanguage$18(this.f18267c, this.d, this.f18268e, this.f18269f);
                return;
            default:
                this.f18266b.lambda$applyRemoteLanguage$14(this.f18267c, this.d, this.f18268e, this.f18269f);
                return;
        }
    }
}
