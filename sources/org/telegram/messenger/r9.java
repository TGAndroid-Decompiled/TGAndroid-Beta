package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r9 implements RequestDelegate {
    public final int f18277a;
    public final MediaDataController f18278b;
    public final String f18279c;

    public r9(MediaDataController mediaDataController, String str, int i10) {
        this.f18277a = i10;
        this.f18278b = mediaDataController;
        this.f18279c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18277a) {
            case 0:
                this.f18278b.lambda$fetchStickerSetInternal$42(this.f18279c, tLObject, tL_error);
                return;
            default:
                this.f18278b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18279c, tLObject, tL_error);
                return;
        }
    }
}
