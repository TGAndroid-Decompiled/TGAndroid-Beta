package defpackage;

import org.telegram.tgnet.TLRPC;
public final class kna implements Runnable {
    public final byte a;
    public final TLRPC.Document b;
    public final int c;
    public final r47 d;
    public final wb2 e;
    public final TLRPC.TL_messages_stickerSet f;

    public kna(TLRPC.Document document, int i, r47 r47Var, wb2 wb2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = r47Var;
        this.e = wb2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        wb2 wb2Var = this.e;
        r47 r47Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                lq3.q(i).a(xb4.r(null, document), r47Var, wb2Var);
                xb4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
            default:
                lq3.q(i).a(xb4.r(null, document), r47Var, wb2Var);
                xb4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
        }
    }
}
