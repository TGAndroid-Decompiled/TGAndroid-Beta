package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class h5 implements Runnable {
    public final int f20455a;
    public final LocaleController f20456b;
    public final LocaleController.LocaleInfo f20457c;
    public final TLObject d;
    public final int f20458e;
    public final Runnable f20459f;

    public h5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i9, Runnable runnable, int i10) {
        this.f20455a = i10;
        this.f20456b = localeController;
        this.f20457c = localeInfo;
        this.d = tLObject;
        this.f20458e = i9;
        this.f20459f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20455a) {
            case 0:
                this.f20456b.lambda$applyRemoteLanguage$16(this.f20457c, this.d, this.f20458e, this.f20459f);
                return;
            case 1:
                this.f20456b.lambda$applyRemoteLanguage$20(this.f20457c, this.d, this.f20458e, this.f20459f);
                return;
            case 2:
                this.f20456b.lambda$applyRemoteLanguage$18(this.f20457c, this.d, this.f20458e, this.f20459f);
                return;
            default:
                this.f20456b.lambda$applyRemoteLanguage$14(this.f20457c, this.d, this.f20458e, this.f20459f);
                return;
        }
    }
}
