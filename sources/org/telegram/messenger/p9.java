package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p9 implements RequestDelegate {
    public final int f19237a;
    public final MediaDataController f19238b;
    public final String f19239c;

    public p9(MediaDataController mediaDataController, String str, int i10) {
        this.f19237a = i10;
        this.f19238b = mediaDataController;
        this.f19239c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19237a) {
            case 0:
                this.f19238b.lambda$fetchStickerSetInternal$42(this.f19239c, tLObject, tL_error);
                return;
            default:
                this.f19238b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19239c, tLObject, tL_error);
                return;
        }
    }
}
