package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class k5 implements Runnable {
    public final int f17609a;
    public final LocaleController f17610b;
    public final LocaleController.LocaleInfo f17611c;
    public final TLObject d;
    public final int e;
    public final Runnable f17612f;

    public k5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17609a = i11;
        this.f17610b = localeController;
        this.f17611c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f17612f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17609a) {
            case 0:
                this.f17610b.lambda$applyRemoteLanguage$16(this.f17611c, this.d, this.e, this.f17612f);
                return;
            case 1:
                this.f17610b.lambda$applyRemoteLanguage$20(this.f17611c, this.d, this.e, this.f17612f);
                return;
            case 2:
                this.f17610b.lambda$applyRemoteLanguage$18(this.f17611c, this.d, this.e, this.f17612f);
                return;
            default:
                this.f17610b.lambda$applyRemoteLanguage$14(this.f17611c, this.d, this.e, this.f17612f);
                return;
        }
    }
}
