package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f18127a;
    public final LocaleController f18128b;
    public final LocaleController.LocaleInfo f18129c;
    public final TLObject d;
    public final int f18130e;
    public final Runnable f18131f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18127a = i11;
        this.f18128b = localeController;
        this.f18129c = localeInfo;
        this.d = tLObject;
        this.f18130e = i10;
        this.f18131f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18127a) {
            case 0:
                this.f18128b.lambda$applyRemoteLanguage$16(this.f18129c, this.d, this.f18130e, this.f18131f);
                return;
            case 1:
                this.f18128b.lambda$applyRemoteLanguage$20(this.f18129c, this.d, this.f18130e, this.f18131f);
                return;
            case 2:
                this.f18128b.lambda$applyRemoteLanguage$18(this.f18129c, this.d, this.f18130e, this.f18131f);
                return;
            default:
                this.f18128b.lambda$applyRemoteLanguage$14(this.f18129c, this.d, this.f18130e, this.f18131f);
                return;
        }
    }
}
