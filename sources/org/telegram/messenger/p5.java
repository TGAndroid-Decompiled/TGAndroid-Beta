package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class p5 implements Runnable {
    public final int f20924a;
    public final LocaleController f20925b;
    public final LocaleController.LocaleInfo f20926c;
    public final TLObject d;
    public final int e;
    public final Runnable f20927f;

    public p5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f20924a = i11;
        this.f20925b = localeController;
        this.f20926c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f20927f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20924a) {
            case 0:
                this.f20925b.lambda$applyRemoteLanguage$16(this.f20926c, this.d, this.e, this.f20927f);
                return;
            case 1:
                this.f20925b.lambda$applyRemoteLanguage$20(this.f20926c, this.d, this.e, this.f20927f);
                return;
            case 2:
                this.f20925b.lambda$applyRemoteLanguage$18(this.f20926c, this.d, this.e, this.f20927f);
                return;
            default:
                this.f20925b.lambda$applyRemoteLanguage$14(this.f20926c, this.d, this.e, this.f20927f);
                return;
        }
    }
}
