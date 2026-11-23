package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet f27294a;
    public final vy f27295b;

    public uy(vy vyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.f27295b = vyVar;
        this.f27294a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new ul(this, tL_error, this.f27294a, tLObject, 26));
    }
}
