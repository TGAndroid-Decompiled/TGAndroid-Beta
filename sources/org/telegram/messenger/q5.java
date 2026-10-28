package org.telegram.messenger;

import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
public final class q5 implements Runnable {
    public final int f21013a;
    public final LocaleController f21014b;
    public final LocaleController.LocaleInfo f21015c;
    public final TLObject d;
    public final int e;
    public final Runnable f21016f;

    public q5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f21013a = i11;
        this.f21014b = localeController;
        this.f21015c = localeInfo;
        this.d = tLObject;
        this.e = i10;
        this.f21016f = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21013a) {
            case 0:
                this.f21014b.lambda$applyRemoteLanguage$16(this.f21015c, this.d, this.e, this.f21016f);
                return;
            case 1:
                this.f21014b.lambda$applyRemoteLanguage$20(this.f21015c, this.d, this.e, this.f21016f);
                return;
            case 2:
                this.f21014b.lambda$applyRemoteLanguage$18(this.f21015c, this.d, this.e, this.f21016f);
                return;
            default:
                this.f21014b.lambda$applyRemoteLanguage$14(this.f21015c, this.d, this.e, this.f21016f);
                return;
        }
    }
}
