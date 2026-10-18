package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class l5 implements Runnable {
    public final int f18844a;
    public final LocaleController f18845b;
    public final LocaleController.LocaleInfo f18846c;
    public final TLObject d;
    public final int e;
    public final Runnable f18847f;

    public l5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18844a = i11;
        this.f18845b = localeController;
        this.f18846c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f18847f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18844a) {
            case 0:
                this.f18845b.lambda$applyRemoteLanguage$16(this.f18846c, this.d, this.e, this.f18847f);
                return;
            case 1:
                this.f18845b.lambda$applyRemoteLanguage$20(this.f18846c, this.d, this.e, this.f18847f);
                return;
            case 2:
                this.f18845b.lambda$applyRemoteLanguage$18(this.f18846c, this.d, this.e, this.f18847f);
                return;
            default:
                this.f18845b.lambda$applyRemoteLanguage$14(this.f18846c, this.d, this.e, this.f18847f);
                return;
        }
    }
}
