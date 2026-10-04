package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f18119a;
    public final LocaleController f18120b;
    public final LocaleController.LocaleInfo f18121c;
    public final TLObject d;
    public final int f18122e;
    public final Runnable f18123f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18119a = i11;
        this.f18120b = localeController;
        this.f18121c = localeInfo;
        this.d = tLObject;
        this.f18122e = i10;
        this.f18123f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18119a) {
            case 0:
                this.f18120b.lambda$applyRemoteLanguage$16(this.f18121c, this.d, this.f18122e, this.f18123f);
                return;
            case 1:
                this.f18120b.lambda$applyRemoteLanguage$20(this.f18121c, this.d, this.f18122e, this.f18123f);
                return;
            case 2:
                this.f18120b.lambda$applyRemoteLanguage$18(this.f18121c, this.d, this.f18122e, this.f18123f);
                return;
            default:
                this.f18120b.lambda$applyRemoteLanguage$14(this.f18121c, this.d, this.f18122e, this.f18123f);
                return;
        }
    }
}
