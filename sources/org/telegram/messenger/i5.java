package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class i5 implements Runnable {
    public final int f17963a;
    public final LocaleController f17964b;
    public final LocaleController.LocaleInfo f17965c;
    public final TLObject d;
    public final int f17966e;
    public final Runnable f17967f;

    public i5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17963a = i11;
        this.f17964b = localeController;
        this.f17965c = localeInfo;
        this.d = tLObject;
        this.f17966e = i10;
        this.f17967f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                this.f17964b.lambda$applyRemoteLanguage$16(this.f17965c, this.d, this.f17966e, this.f17967f);
                return;
            case 1:
                this.f17964b.lambda$applyRemoteLanguage$20(this.f17965c, this.d, this.f17966e, this.f17967f);
                return;
            case 2:
                this.f17964b.lambda$applyRemoteLanguage$18(this.f17965c, this.d, this.f17966e, this.f17967f);
                return;
            default:
                this.f17964b.lambda$applyRemoteLanguage$14(this.f17965c, this.d, this.f17966e, this.f17967f);
                return;
        }
    }
}
