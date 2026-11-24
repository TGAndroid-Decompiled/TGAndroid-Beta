package defpackage;

import org.telegram.tgnet.TLRPC;
public final class rla implements Runnable {
    public final byte a;
    public final TLRPC.Document b;
    public final int c;
    public final k47 d;
    public final rc2 e;
    public final TLRPC.TL_messages_stickerSet f;

    public rla(TLRPC.Document document, int i, k47 k47Var, rc2 rc2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = k47Var;
        this.e = rc2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        rc2 rc2Var = this.e;
        k47 k47Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                er3.q(i).a(bc4.r(null, document), k47Var, rc2Var);
                bc4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
            default:
                er3.q(i).a(bc4.r(null, document), k47Var, rc2Var);
                bc4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
        }
    }
}
