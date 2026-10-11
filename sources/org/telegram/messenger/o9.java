package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18756a;
    public final MediaDataController f18757b;
    public final String f18758c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18756a = i10;
        this.f18757b = mediaDataController;
        this.f18758c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18756a) {
            case 0:
                this.f18757b.lambda$fetchStickerSetInternal$42(this.f18758c, tLObject, tL_error);
                return;
            default:
                this.f18757b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18758c, tLObject, tL_error);
                return;
        }
    }
}
