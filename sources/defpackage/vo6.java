package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vo6 implements p8c {
    public final byte a;
    public final hq6 b;
    public final TLRPC.StickerSet c;

    public vo6(hq6 hq6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        hq6 hq6Var = this.b;
        ArrayList arrayList = (ArrayList) obj;
        switch (b) {
            case 0:
                hq6Var.g1(stickerSet.id, false);
                return;
            default:
                hq6Var.h1(stickerSet.id, false);
                return;
        }
    }
}
