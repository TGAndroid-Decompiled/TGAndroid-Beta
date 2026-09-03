package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7 implements RequestDelegate {
    public final int f18470a;
    public final MediaDataController f18471b;
    public final String f18472c;

    public d7(MediaDataController mediaDataController, String str, int i10) {
        this.f18470a = i10;
        this.f18471b = mediaDataController;
        this.f18472c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18470a) {
            case 0:
                this.f18471b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18472c, tLObject, tL_error);
                return;
            default:
                this.f18471b.lambda$fetchStickerSetInternal$42(this.f18472c, tLObject, tL_error);
                return;
        }
    }
}
