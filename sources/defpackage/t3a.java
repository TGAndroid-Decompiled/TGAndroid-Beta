package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t3a implements RequestDelegate {
    public final TLRPC.TL_stickers_createStickerSet a;
    public final u3a b;

    public t3a(u3a u3aVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = u3aVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new bm8(this, tL_error, this.a, tLObject));
    }
}
