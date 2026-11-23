package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh implements w10 {
    public final int f24356a;
    public final ri f24357b;
    public final TLRPC.StickerSet f24358c;

    public gh(ri riVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f24356a = i7;
        this.f24357b = riVar;
        this.f24358c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f24356a;
        ArrayList arrayList = (ArrayList) obj;
        ri riVar = this.f24357b;
        riVar.getClass();
        switch (i7) {
            case 0:
                riVar.i1(this.f24358c.f28519id, false);
                return;
            default:
                riVar.j1(this.f24358c.f28519id, false);
                return;
        }
    }
}
