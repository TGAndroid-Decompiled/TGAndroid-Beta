package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements c20 {
    public final int f22915a;
    public final ui f22916b;
    public final TLRPC.StickerSet f22917c;

    public hh(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f22915a = i7;
        this.f22916b = uiVar;
        this.f22917c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f22915a;
        ArrayList arrayList = (ArrayList) obj;
        ui uiVar = this.f22916b;
        uiVar.getClass();
        switch (i7) {
            case 0:
                uiVar.f1(this.f22917c.f26987id, false);
                return;
            default:
                uiVar.g1(this.f22917c.f26987id, false);
                return;
        }
    }
}
