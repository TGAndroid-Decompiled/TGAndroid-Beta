package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh implements x10 {
    public final int f24283a;
    public final ri f24284b;
    public final TLRPC.StickerSet f24285c;

    public gh(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24283a = i7;
        this.f24284b = riVar;
        this.f24285c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24283a;
        ArrayList arrayList = (ArrayList) obj;
        ri riVar = this.f24284b;
        riVar.getClass();
        switch (i7) {
            case 0:
                riVar.i1(this.f24285c.f28458id, false);
                return;
            default:
                riVar.j1(this.f24285c.f28458id, false);
                return;
        }
    }
}
