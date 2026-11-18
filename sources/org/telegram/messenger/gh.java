package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh implements x10 {
    public final int f24255a;
    public final ri f24256b;
    public final TLRPC.StickerSet f24257c;

    public gh(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24255a = i7;
        this.f24256b = riVar;
        this.f24257c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24255a;
        ArrayList arrayList = (ArrayList) obj;
        ri riVar = this.f24256b;
        riVar.getClass();
        switch (i7) {
            case 0:
                riVar.i1(this.f24257c.f28430id, false);
                return;
            default:
                riVar.j1(this.f24257c.f28430id, false);
                return;
        }
    }
}
