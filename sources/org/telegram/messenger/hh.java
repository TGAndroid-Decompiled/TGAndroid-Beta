package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements y10 {
    public final int f24486a;
    public final si f24487b;
    public final TLRPC.StickerSet f24488c;

    public hh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24486a = i7;
        this.f24487b = siVar;
        this.f24488c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24486a;
        ArrayList arrayList = (ArrayList) obj;
        si siVar = this.f24487b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.i1(this.f24488c.f28461id, false);
                return;
            default:
                siVar.j1(this.f24488c.f28461id, false);
                return;
        }
    }
}
