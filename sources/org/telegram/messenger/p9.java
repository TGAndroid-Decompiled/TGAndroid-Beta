package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p9 implements RequestDelegate {
    public final int f19240a;
    public final MediaDataController f19241b;
    public final String f19242c;

    public p9(MediaDataController mediaDataController, String str, int i10) {
        this.f19240a = i10;
        this.f19241b = mediaDataController;
        this.f19242c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19240a) {
            case 0:
                this.f19241b.lambda$fetchStickerSetInternal$42(this.f19242c, tLObject, tL_error);
                return;
            default:
                this.f19241b.lambda$verifyAnimatedStickerMessageInternal$70(this.f19242c, tLObject, tL_error);
                return;
        }
    }
}
