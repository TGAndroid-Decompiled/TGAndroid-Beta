package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class m5 implements Runnable {
    public final int f18252a;
    public final LocaleController f18253b;
    public final LocaleController.LocaleInfo f18254c;
    public final TLObject d;
    public final int f18255e;
    public final Runnable f18256f;

    public m5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18252a = i11;
        this.f18253b = localeController;
        this.f18254c = localeInfo;
        this.d = tLObject;
        this.f18255e = i10;
        this.f18256f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18252a) {
            case 0:
                this.f18253b.lambda$applyRemoteLanguage$16(this.f18254c, this.d, this.f18255e, this.f18256f);
                return;
            case 1:
                this.f18253b.lambda$applyRemoteLanguage$20(this.f18254c, this.d, this.f18255e, this.f18256f);
                return;
            case 2:
                this.f18253b.lambda$applyRemoteLanguage$18(this.f18254c, this.d, this.f18255e, this.f18256f);
                return;
            default:
                this.f18253b.lambda$applyRemoteLanguage$14(this.f18254c, this.d, this.f18255e, this.f18256f);
                return;
        }
    }
}
