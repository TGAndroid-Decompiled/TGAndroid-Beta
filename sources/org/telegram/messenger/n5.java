package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class n5 implements Runnable {
    public final int f19016a;
    public final LocaleController f19017b;
    public final LocaleController.LocaleInfo f19018c;
    public final TLObject d;
    public final int e;
    public final Runnable f19019f;

    public n5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f19016a = i11;
        this.f19017b = localeController;
        this.f19018c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f19019f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                this.f19017b.lambda$applyRemoteLanguage$16(this.f19018c, this.d, this.e, this.f19019f);
                return;
            case 1:
                this.f19017b.lambda$applyRemoteLanguage$20(this.f19018c, this.d, this.e, this.f19019f);
                return;
            case 2:
                this.f19017b.lambda$applyRemoteLanguage$18(this.f19018c, this.d, this.e, this.f19019f);
                return;
            default:
                this.f19017b.lambda$applyRemoteLanguage$14(this.f19018c, this.d, this.e, this.f19019f);
                return;
        }
    }
}
