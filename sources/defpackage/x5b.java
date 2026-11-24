package defpackage;

import org.telegram.tgnet.TLRPC;
public final class x5b implements qac {
    public final byte a;
    public final y5b b;

    public x5b(y5b y5bVar, byte b) {
        this.a = b;
        this.b = y5bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        y5b y5bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                y5bVar.d(tL_messages_stickerSet);
                return;
            default:
                y5bVar.b(tL_messages_stickerSet);
                return;
        }
    }
}
