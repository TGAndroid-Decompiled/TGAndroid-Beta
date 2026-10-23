package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements RequestDelegate {
    public final int f19568a;
    public final MediaDataController f19569b;
    public final String f19570c;

    public s9(MediaDataController mediaDataController, String str, int i10) {
        this.f19568a = i10;
        this.f19569b = mediaDataController;
        this.f19570c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19568a) {
            case 0:
                this.f19569b.lambda$fetchStickerSetInternal$42(this.f19570c, tLObject, tL_error);
                return;
            default:
                this.f19569b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19570c, tLObject, tL_error);
                return;
        }
    }
}
