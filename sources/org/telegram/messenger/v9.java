package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v9 implements RequestDelegate {
    public final int f21505a;
    public final MediaDataController f21506b;
    public final String f21507c;

    public v9(MediaDataController mediaDataController, String str, int i10) {
        this.f21505a = i10;
        this.f21506b = mediaDataController;
        this.f21507c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21505a) {
            case 0:
                this.f21506b.lambda$fetchStickerSetInternal$42(this.f21507c, tLObject, tL_error);
                return;
            default:
                this.f21506b.lambda$verifyAnimatedStickerMessageInternal$70(this.f21507c, tLObject, tL_error);
                return;
        }
    }
}
