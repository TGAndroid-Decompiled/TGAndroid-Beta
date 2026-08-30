package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7 implements RequestDelegate {
    public final int f17038a;
    public final MediaDataController f17039b;
    public final String f17040c;

    public d7(MediaDataController mediaDataController, String str, int i10) {
        this.f17038a = i10;
        this.f17039b = mediaDataController;
        this.f17040c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17038a) {
            case 0:
                this.f17039b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17040c, tLObject, tL_error);
                return;
            default:
                this.f17039b.lambda$fetchStickerSetInternal$42(this.f17040c, tLObject, tL_error);
                return;
        }
    }
}
