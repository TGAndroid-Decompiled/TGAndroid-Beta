package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19643a;
    public final MediaDataController f19644b;
    public final String f19645c;

    public t9(MediaDataController mediaDataController, String str, int i10) {
        this.f19643a = i10;
        this.f19644b = mediaDataController;
        this.f19645c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19643a) {
            case 0:
                this.f19644b.lambda$fetchStickerSetInternal$42(this.f19645c, tLObject, tL_error);
                return;
            default:
                this.f19644b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19645c, tLObject, tL_error);
                return;
        }
    }
}
