package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f18763a;
    public final MediaDataController f18764b;
    public final String f18765c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f18763a = i10;
        this.f18764b = mediaDataController;
        this.f18765c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18763a) {
            case 0:
                this.f18764b.lambda$fetchStickerSetInternal$42(this.f18765c, tLObject, tL_error);
                return;
            default:
                this.f18764b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18765c, tLObject, tL_error);
                return;
        }
    }
}
