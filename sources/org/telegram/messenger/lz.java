package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lz implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f17017a;
    public final mz f17018b;

    public lz(mz mzVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f17018b = mzVar;
        this.f17017a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new vl(this, tL_error, this.f17017a, tLObject, 26));
    }
}
