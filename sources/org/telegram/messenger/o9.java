package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o9 implements RequestDelegate {
    public final int f19163a;
    public final MediaDataController f19164b;
    public final String f19165c;

    public o9(MediaDataController mediaDataController, String str, int i10) {
        this.f19163a = i10;
        this.f19164b = mediaDataController;
        this.f19165c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19163a) {
            case 0:
                this.f19164b.lambda$fetchStickerSetInternal$42(this.f19165c, tLObject, tL_error);
                return;
            default:
                this.f19164b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19165c, tLObject, tL_error);
                return;
        }
    }
}
