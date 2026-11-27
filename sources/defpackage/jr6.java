package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jr6 implements pcc {
    public final byte a;
    public final ls6 b;
    public final TLRPC.StickerSet c;

    public jr6(ls6 ls6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        ls6 ls6Var = this.b;
        ArrayList arrayList = (ArrayList) obj;
        switch (b) {
            case 0:
                ls6Var.g1(stickerSet.id, false);
                return;
            default:
                ls6Var.h1(stickerSet.id, false);
                return;
        }
    }
}
