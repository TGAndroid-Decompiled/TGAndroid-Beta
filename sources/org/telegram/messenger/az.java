package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f21552a;
    public final bz f21553b;

    public az(bz bzVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f21553b = bzVar;
        this.f21552a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new em(this, tL_error, this.f21552a, tLObject, 26));
    }
}
