package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements y10 {
    public final int f24450a;
    public final si f24451b;
    public final TLRPC.StickerSet f24452c;

    public hh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24450a = i7;
        this.f24451b = siVar;
        this.f24452c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24450a;
        ArrayList arrayList = (ArrayList) obj;
        si siVar = this.f24451b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.i1(this.f24452c.f28425id, false);
                return;
            default:
                siVar.j1(this.f24452c.f28425id, false);
                return;
        }
    }
}
