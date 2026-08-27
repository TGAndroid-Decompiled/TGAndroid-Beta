package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class j5 implements Runnable {

    public final int f20637a;

    public final LocaleController f20638b;

    public final LocaleController.LocaleInfo f20639c;
    public final TLObject d;

    public final int f20640e;

    public final Runnable f20641f;

    public j5(LocaleController localeController, LocaleController.LocaleInfo localeInfo, TLObject tLObject, int i10, Runnable runnable, int i11) {
        this.f20637a = i11;
        this.f20638b = localeController;
        this.f20639c = localeInfo;
        this.d = tLObject;
        this.f20640e = i10;
        this.f20641f = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20637a) {
            case 0:
                this.f20638b.lambda$applyRemoteLanguage$16(this.f20639c, this.d, this.f20640e, this.f20641f);
                break;
            case 1:
                this.f20638b.lambda$applyRemoteLanguage$20(this.f20639c, this.d, this.f20640e, this.f20641f);
                break;
            case 2:
                this.f20638b.lambda$applyRemoteLanguage$18(this.f20639c, this.d, this.f20640e, this.f20641f);
                break;
            default:
                this.f20638b.lambda$applyRemoteLanguage$14(this.f20639c, this.d, this.f20640e, this.f20641f);
                break;
        }
    }
}
