package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ty implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f27096a;
    public final uy f27097b;

    public ty(uy uyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f27097b = uyVar;
        this.f27096a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new tl(this, tL_error, this.f27096a, tLObject, 26));
    }
}
