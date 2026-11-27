package defpackage;

import org.telegram.tgnet.TLRPC;
public final class t7b implements pcc {
    public final byte a;
    public final u7b b;

    public t7b(u7b u7bVar, byte b) {
        this.a = b;
        this.b = u7bVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        u7b u7bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                u7bVar.d(tL_messages_stickerSet);
                return;
            default:
                u7bVar.b(tL_messages_stickerSet);
                return;
        }
    }
}
