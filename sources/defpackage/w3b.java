package defpackage;

import org.telegram.tgnet.TLRPC;
public final class w3b implements p8c {
    public final byte a;
    public final x3b b;

    public w3b(x3b x3bVar, byte b) {
        this.a = b;
        this.b = x3bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        x3b x3bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                x3bVar.d(tL_messages_stickerSet);
                return;
            default:
                x3bVar.b(tL_messages_stickerSet);
                return;
        }
    }
}
