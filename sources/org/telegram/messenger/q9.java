package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q9 implements RequestDelegate {
    public final int f19335a;
    public final MediaDataController f19336b;
    public final String f19337c;

    public q9(MediaDataController mediaDataController, String str, int i10) {
        this.f19335a = i10;
        this.f19336b = mediaDataController;
        this.f19337c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19335a) {
            case 0:
                this.f19336b.lambda$fetchStickerSetInternal$42(this.f19337c, tLObject, tL_error);
                return;
            default:
                this.f19336b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19337c, tLObject, tL_error);
                return;
        }
    }
}
