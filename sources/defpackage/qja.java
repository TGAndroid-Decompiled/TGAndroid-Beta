package defpackage;

import org.telegram.tgnet.TLRPC;
public final class qja implements Runnable {
    public final byte a;
    public final TLRPC.Document b;
    public final int c;
    public final k27 d;
    public final gb2 e;
    public final TLRPC.TL_messages_stickerSet f;

    public qja(TLRPC.Document document, int i, k27 k27Var, gb2 gb2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = k27Var;
        this.e = gb2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        gb2 gb2Var = this.e;
        k27 k27Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                up3.q(i).a(ba4.r(null, document), k27Var, gb2Var);
                ba4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
            default:
                up3.q(i).a(ba4.r(null, document), k27Var, gb2Var);
                ba4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                return;
        }
    }
}
