package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class o5 implements Runnable {
    public final int f19101a;
    public final LocaleController f19102b;
    public final LocaleController.LocaleInfo f19103c;
    public final TLObject d;
    public final int e;
    public final Runnable f19104f;

    public o5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f19101a = i11;
        this.f19102b = localeController;
        this.f19103c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f19104f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19101a) {
            case 0:
                this.f19102b.lambda$applyRemoteLanguage$16(this.f19103c, this.d, this.e, this.f19104f);
                return;
            case 1:
                this.f19102b.lambda$applyRemoteLanguage$20(this.f19103c, this.d, this.e, this.f19104f);
                return;
            case 2:
                this.f19102b.lambda$applyRemoteLanguage$18(this.f19103c, this.d, this.e, this.f19104f);
                return;
            default:
                this.f19102b.lambda$applyRemoteLanguage$14(this.f19103c, this.d, this.e, this.f19104f);
                return;
        }
    }
}
