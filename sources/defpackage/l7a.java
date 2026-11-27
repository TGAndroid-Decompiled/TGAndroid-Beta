package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l7a implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet a;
    public final m7a b;

    public l7a(m7a m7aVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = m7aVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new vp8(this, tL_error, this.a, tLObject, (byte) 18));
    }
}
