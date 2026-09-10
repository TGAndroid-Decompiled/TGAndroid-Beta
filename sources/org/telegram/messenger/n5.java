package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class n5 implements Runnable {
    public final int f15830a;
    public final LocaleController f15831b;
    public final LocaleController.LocaleInfo f15832c;
    public final TLObject d;
    public final int e;
    public final Runnable f15833f;

    public n5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f15830a = i11;
        this.f15831b = localeController;
        this.f15832c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f15833f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15830a) {
            case 0:
                this.f15831b.lambda$applyRemoteLanguage$16(this.f15832c, this.d, this.e, this.f15833f);
                return;
            case 1:
                this.f15831b.lambda$applyRemoteLanguage$20(this.f15832c, this.d, this.e, this.f15833f);
                return;
            case 2:
                this.f15831b.lambda$applyRemoteLanguage$18(this.f15832c, this.d, this.e, this.f15833f);
                return;
            default:
                this.f15831b.lambda$applyRemoteLanguage$14(this.f15832c, this.d, this.e, this.f15833f);
                return;
        }
    }
}
