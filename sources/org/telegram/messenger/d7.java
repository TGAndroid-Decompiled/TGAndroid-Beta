package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d7 implements RequestDelegate {
    public final int f18468a;
    public final MediaDataController f18469b;
    public final String f18470c;

    public d7(MediaDataController mediaDataController, String str, int i10) {
        this.f18468a = i10;
        this.f18469b = mediaDataController;
        this.f18470c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18468a) {
            case 0:
                this.f18469b.lambda$verifyAnimatedStickerMessageInternal$70(this.f18470c, tLObject, tL_error);
                return;
            default:
                this.f18469b.lambda$fetchStickerSetInternal$42(this.f18470c, tLObject, tL_error);
                return;
        }
    }
}
