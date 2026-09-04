package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f17131a;
    public final MediaDataController f17132b;
    public final String f17133c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17131a = i10;
        this.f17132b = mediaDataController;
        this.f17133c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17131a) {
            case 0:
                this.f17132b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17133c, tLObject, tL_error);
                return;
            default:
                this.f17132b.lambda$fetchStickerSetInternal$42(this.f17133c, tLObject, tL_error);
                return;
        }
    }
}
