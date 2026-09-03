package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class k5 implements Runnable {
    public final int f19125a;
    public final LocaleController f19126b;
    public final LocaleController.LocaleInfo f19127c;
    public final TLObject d;
    public final int f19128e;
    public final Runnable f19129f;

    public k5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f19125a = i11;
        this.f19126b = localeController;
        this.f19127c = localeInfo;
        this.d = tLObject;
        this.f19128e = i10;
        this.f19129f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19125a) {
            case 0:
                this.f19126b.lambda$applyRemoteLanguage$16(this.f19127c, this.d, this.f19128e, this.f19129f);
                return;
            case 1:
                this.f19126b.lambda$applyRemoteLanguage$20(this.f19127c, this.d, this.f19128e, this.f19129f);
                return;
            case 2:
                this.f19126b.lambda$applyRemoteLanguage$18(this.f19127c, this.d, this.f19128e, this.f19129f);
                return;
            default:
                this.f19126b.lambda$applyRemoteLanguage$14(this.f19127c, this.d, this.f19128e, this.f19129f);
                return;
        }
    }
}
