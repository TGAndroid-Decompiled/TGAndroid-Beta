package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u5a implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet a;
    public final v5a b;

    public u5a(v5a v5aVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = v5aVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new no8(this, tL_error, this.a, tLObject, (byte) 17));
    }
}
