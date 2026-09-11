package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class h5 implements Runnable {
    public final int f17856a;
    public final LocaleController f17857b;
    public final LocaleController.LocaleInfo f17858c;
    public final TLObject d;
    public final int f17859e;
    public final Runnable f17860f;

    public h5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17856a = i11;
        this.f17857b = localeController;
        this.f17858c = localeInfo;
        this.d = tLObject;
        this.f17859e = i10;
        this.f17860f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17856a) {
            case 0:
                this.f17857b.lambda$applyRemoteLanguage$16(this.f17858c, this.d, this.f17859e, this.f17860f);
                return;
            case 1:
                this.f17857b.lambda$applyRemoteLanguage$20(this.f17858c, this.d, this.f17859e, this.f17860f);
                return;
            case 2:
                this.f17857b.lambda$applyRemoteLanguage$18(this.f17858c, this.d, this.f17859e, this.f17860f);
                return;
            default:
                this.f17857b.lambda$applyRemoteLanguage$14(this.f17858c, this.d, this.f17859e, this.f17860f);
                return;
        }
    }
}
