package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f18128a;
    public final LocaleController f18129b;
    public final LocaleController.LocaleInfo f18130c;
    public final TLObject d;
    public final int f18131e;
    public final Runnable f18132f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18128a = i11;
        this.f18129b = localeController;
        this.f18130c = localeInfo;
        this.d = tLObject;
        this.f18131e = i10;
        this.f18132f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18128a) {
            case 0:
                this.f18129b.lambda$applyRemoteLanguage$16(this.f18130c, this.d, this.f18131e, this.f18132f);
                return;
            case 1:
                this.f18129b.lambda$applyRemoteLanguage$20(this.f18130c, this.d, this.f18131e, this.f18132f);
                return;
            case 2:
                this.f18129b.lambda$applyRemoteLanguage$18(this.f18130c, this.d, this.f18131e, this.f18132f);
                return;
            default:
                this.f18129b.lambda$applyRemoteLanguage$14(this.f18130c, this.d, this.f18131e, this.f18132f);
                return;
        }
    }
}
