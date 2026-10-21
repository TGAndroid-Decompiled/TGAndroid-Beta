package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q9 implements RequestDelegate {
    public final int f19332a;
    public final MediaDataController f19333b;
    public final String f19334c;

    public q9(MediaDataController mediaDataController, String str, int i10) {
        this.f19332a = i10;
        this.f19333b = mediaDataController;
        this.f19334c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19332a) {
            case 0:
                this.f19333b.lambda$fetchStickerSetInternal$42(this.f19334c, tLObject, tL_error);
                return;
            default:
                this.f19333b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19334c, tLObject, tL_error);
                return;
        }
    }
}
