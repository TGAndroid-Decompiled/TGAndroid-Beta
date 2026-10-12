package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class m5 implements Runnable {
    public final int f18251a;
    public final LocaleController f18252b;
    public final LocaleController.LocaleInfo f18253c;
    public final TLObject d;
    public final int f18254e;
    public final Runnable f18255f;

    public m5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18251a = i11;
        this.f18252b = localeController;
        this.f18253c = localeInfo;
        this.d = tLObject;
        this.f18254e = i10;
        this.f18255f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18251a) {
            case 0:
                this.f18252b.lambda$applyRemoteLanguage$16(this.f18253c, this.d, this.f18254e, this.f18255f);
                return;
            case 1:
                this.f18252b.lambda$applyRemoteLanguage$20(this.f18253c, this.d, this.f18254e, this.f18255f);
                return;
            case 2:
                this.f18252b.lambda$applyRemoteLanguage$18(this.f18253c, this.d, this.f18254e, this.f18255f);
                return;
            default:
                this.f18252b.lambda$applyRemoteLanguage$14(this.f18253c, this.d, this.f18254e, this.f18255f);
                return;
        }
    }
}
