package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f17936a;
    public final LocaleController f17937b;
    public final LocaleController.LocaleInfo f17938c;
    public final TLObject d;
    public final int f17939e;
    public final Runnable f17940f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17936a = i11;
        this.f17937b = localeController;
        this.f17938c = localeInfo;
        this.d = tLObject;
        this.f17939e = i10;
        this.f17940f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17936a) {
            case 0:
                this.f17937b.lambda$applyRemoteLanguage$16(this.f17938c, this.d, this.f17939e, this.f17940f);
                return;
            case 1:
                this.f17937b.lambda$applyRemoteLanguage$20(this.f17938c, this.d, this.f17939e, this.f17940f);
                return;
            case 2:
                this.f17937b.lambda$applyRemoteLanguage$18(this.f17938c, this.d, this.f17939e, this.f17940f);
                return;
            default:
                this.f17937b.lambda$applyRemoteLanguage$14(this.f17938c, this.d, this.f17939e, this.f17940f);
                return;
        }
    }
}
