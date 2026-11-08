package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f21577a;
    public final bz f21578b;

    public az(bz bzVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f21578b = bzVar;
        this.f21577a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new em(this, tL_error, this.f21577a, tLObject, 26));
    }
}
