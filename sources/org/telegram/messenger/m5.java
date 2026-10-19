package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class m5 implements Runnable {
    public final int f18922a;
    public final LocaleController f18923b;
    public final LocaleController.LocaleInfo f18924c;
    public final TLObject d;
    public final int e;
    public final Runnable f18925f;

    public m5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18922a = i11;
        this.f18923b = localeController;
        this.f18924c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f18925f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18922a) {
            case 0:
                this.f18923b.lambda$applyRemoteLanguage$16(this.f18924c, this.d, this.e, this.f18925f);
                return;
            case 1:
                this.f18923b.lambda$applyRemoteLanguage$20(this.f18924c, this.d, this.e, this.f18925f);
                return;
            case 2:
                this.f18923b.lambda$applyRemoteLanguage$18(this.f18924c, this.d, this.e, this.f18925f);
                return;
            default:
                this.f18923b.lambda$applyRemoteLanguage$14(this.f18924c, this.d, this.e, this.f18925f);
                return;
        }
    }
}
