package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kz implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f16652a;
    public final lz f16653b;

    public kz(lz lzVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f16653b = lzVar;
        this.f16652a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new ul(this, tL_error, this.f16652a, tLObject, 26));
    }
}
