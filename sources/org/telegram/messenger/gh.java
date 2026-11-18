package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh implements x10 {
    public final int f24258a;
    public final ri f24259b;
    public final TLRPC.StickerSet f24260c;

    public gh(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24258a = i7;
        this.f24259b = riVar;
        this.f24260c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24258a;
        ArrayList arrayList = (ArrayList) obj;
        ri riVar = this.f24259b;
        riVar.getClass();
        switch (i7) {
            case 0:
                riVar.i1(this.f24260c.f28432id, false);
                return;
            default:
                riVar.j1(this.f24260c.f28432id, false);
                return;
        }
    }
}
