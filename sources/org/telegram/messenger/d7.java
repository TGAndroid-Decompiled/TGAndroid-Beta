package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7 implements RequestDelegate {
    public final int f17021a;
    public final MediaDataController f17022b;
    public final String f17023c;

    public d7(MediaDataController mediaDataController, String str, int i10) {
        this.f17021a = i10;
        this.f17022b = mediaDataController;
        this.f17023c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17021a) {
            case 0:
                this.f17022b.lambda$verifyAnimatedStickerMessageInternal$70(this.f17023c, tLObject, tL_error);
                return;
            default:
                this.f17022b.lambda$fetchStickerSetInternal$42(this.f17023c, tLObject, tL_error);
                return;
        }
    }
}
