package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18762a;
    public final MediaDataController f18763b;
    public final String f18764c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18762a = i10;
        this.f18763b = mediaDataController;
        this.f18764c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18762a) {
            case 0:
                this.f18763b.lambda$fetchStickerSetInternal$42(this.f18764c, tLObject, tL_error);
                return;
            default:
                this.f18763b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18764c, tLObject, tL_error);
                return;
        }
    }
}
