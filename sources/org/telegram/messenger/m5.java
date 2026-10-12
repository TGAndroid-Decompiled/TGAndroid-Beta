package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class m5 implements Runnable {
    public final int f17842a;
    public final LocaleController f17843b;
    public final LocaleController.LocaleInfo f17844c;
    public final TLObject d;
    public final int e;
    public final Runnable f17845f;

    public m5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f17842a = i11;
        this.f17843b = localeController;
        this.f17844c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f17845f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17842a) {
            case 0:
                this.f17843b.lambda$applyRemoteLanguage$16(this.f17844c, this.d, this.e, this.f17845f);
                return;
            case 1:
                this.f17843b.lambda$applyRemoteLanguage$20(this.f17844c, this.d, this.e, this.f17845f);
                return;
            case 2:
                this.f17843b.lambda$applyRemoteLanguage$18(this.f17844c, this.d, this.e, this.f17845f);
                return;
            default:
                this.f17843b.lambda$applyRemoteLanguage$14(this.f17844c, this.d, this.e, this.f17845f);
                return;
        }
    }
}
