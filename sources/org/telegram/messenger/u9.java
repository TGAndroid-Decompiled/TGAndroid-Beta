package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u9 implements RequestDelegate {
    public final int f21399a;
    public final MediaDataController f21400b;
    public final String f21401c;

    public u9(MediaDataController mediaDataController, String str, int i10) {
        this.f21399a = i10;
        this.f21400b = mediaDataController;
        this.f21401c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21399a) {
            case 0:
                this.f21400b.lambda$fetchStickerSetInternal$42(this.f21401c, tLObject, tL_error);
                return;
            default:
                this.f21400b.lambda$verifyAnimatedStickerMessageInternal$70(this.f21401c, tLObject, tL_error);
                return;
        }
    }
}
