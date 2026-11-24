package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vq6 implements qac {
    public final byte a;
    public final hs6 b;
    public final TLRPC.StickerSet c;

    public vq6(hs6 hs6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        hs6 hs6Var = this.b;
        ArrayList arrayList = (ArrayList) obj;
        switch (b) {
            case 0:
                hs6Var.g1(stickerSet.id, false);
                return;
            default:
                hs6Var.h1(stickerSet.id, false);
                return;
        }
    }
}
