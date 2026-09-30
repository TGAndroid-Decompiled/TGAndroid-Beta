package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f16637a;
    public final LocaleController f16638b;
    public final LocaleController.LocaleInfo f16639c;
    public final TLObject d;
    public final int e;
    public final Runnable f16640f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f16637a = i11;
        this.f16638b = localeController;
        this.f16639c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f16640f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16637a) {
            case 0:
                this.f16638b.lambda$applyRemoteLanguage$16(this.f16639c, this.d, this.e, this.f16640f);
                return;
            case 1:
                this.f16638b.lambda$applyRemoteLanguage$20(this.f16639c, this.d, this.e, this.f16640f);
                return;
            case 2:
                this.f16638b.lambda$applyRemoteLanguage$18(this.f16639c, this.d, this.e, this.f16640f);
                return;
            default:
                this.f16638b.lambda$applyRemoteLanguage$14(this.f16639c, this.d, this.e, this.f16640f);
                return;
        }
    }
}
