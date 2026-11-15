package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fh implements z10 {
    public final int f23493a;
    public final si f23494b;
    public final TLRPC.StickerSet f23495c;

    public fh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f23493a = i7;
        this.f23494b = siVar;
        this.f23495c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f23493a;
        ArrayList arrayList = (ArrayList) obj;
        si siVar = this.f23494b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.f1(this.f23495c.f28078id, false);
                return;
            default:
                siVar.g1(this.f23495c.f28078id, false);
                return;
        }
    }
}
