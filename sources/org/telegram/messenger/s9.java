package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements RequestDelegate {
    public final int f19500a;
    public final MediaDataController f19501b;
    public final String f19502c;

    public s9(MediaDataController mediaDataController, String str, int i10) {
        this.f19500a = i10;
        this.f19501b = mediaDataController;
        this.f19502c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19500a) {
            case 0:
                this.f19501b.lambda$fetchStickerSetInternal$42(this.f19502c, tLObject, tL_error);
                return;
            default:
                this.f19501b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19502c, tLObject, tL_error);
                return;
        }
    }
}
