package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class j5 implements Runnable {
    public final int f18220a;
    public final LocaleController f18221b;
    public final LocaleController.LocaleInfo f18222c;
    public final TLObject d;
    public final int f18223e;
    public final Runnable f18224f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f18220a = i11;
        this.f18221b = localeController;
        this.f18222c = localeInfo;
        this.d = tLObject;
        this.f18223e = i10;
        this.f18224f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18220a) {
            case 0:
                this.f18221b.lambda$applyRemoteLanguage$16(this.f18222c, this.d, this.f18223e, this.f18224f);
                return;
            case 1:
                this.f18221b.lambda$applyRemoteLanguage$20(this.f18222c, this.d, this.f18223e, this.f18224f);
                return;
            case 2:
                this.f18221b.lambda$applyRemoteLanguage$18(this.f18222c, this.d, this.f18223e, this.f18224f);
                return;
            default:
                this.f18221b.lambda$applyRemoteLanguage$14(this.f18222c, this.d, this.f18223e, this.f18224f);
                return;
        }
    }
}
