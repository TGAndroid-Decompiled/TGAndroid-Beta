package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements c20 {
    public final int f22911a;
    public final ui f22912b;
    public final TLRPC.StickerSet f22913c;

    public hh(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f22911a = i7;
        this.f22912b = uiVar;
        this.f22913c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f22911a;
        ArrayList arrayList = (ArrayList) obj;
        ui uiVar = this.f22912b;
        uiVar.getClass();
        switch (i7) {
            case 0:
                uiVar.f1(this.f22913c.f26983id, false);
                return;
            default:
                uiVar.g1(this.f22913c.f26983id, false);
                return;
        }
    }
}
