package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f27258a;
    public final vy f27259b;

    public uy(vy vyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f27259b = vyVar;
        this.f27258a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new ul(this, tL_error, this.f27258a, tLObject, 26));
    }
}
