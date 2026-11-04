package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f25449a;
    public final ty f25450b;

    public sy(ty tyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f25450b = tyVar;
        this.f25449a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new ul(this, tL_error, this.f25449a, tLObject, 26));
    }
}
