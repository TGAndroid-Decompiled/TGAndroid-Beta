package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class k5 implements Runnable {
    public final int f19123a;
    public final LocaleController f19124b;
    public final LocaleController.LocaleInfo f19125c;
    public final TLObject d;
    public final int f19126e;
    public final Runnable f19127f;

    public k5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f19123a = i11;
        this.f19124b = localeController;
        this.f19125c = localeInfo;
        this.d = tLObject;
        this.f19126e = i10;
        this.f19127f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19123a) {
            case 0:
                this.f19124b.lambda$applyRemoteLanguage$16(this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
            case 1:
                this.f19124b.lambda$applyRemoteLanguage$20(this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
            case 2:
                this.f19124b.lambda$applyRemoteLanguage$18(this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
            default:
                this.f19124b.lambda$applyRemoteLanguage$14(this.f19125c, this.d, this.f19126e, this.f19127f);
                return;
        }
    }
}
