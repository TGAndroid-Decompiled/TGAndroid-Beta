package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19576a;
    public final MediaDataController f19577b;
    public final String f19578c;

    public t9(MediaDataController mediaDataController, String str, int i10) {
        this.f19576a = i10;
        this.f19577b = mediaDataController;
        this.f19578c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19576a) {
            case 0:
                this.f19577b.lambda$fetchStickerSetInternal$42(this.f19578c, tLObject, tL_error);
                return;
            default:
                this.f19577b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19578c, tLObject, tL_error);
                return;
        }
    }
}
