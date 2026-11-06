package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements c20 {
    public final int f22935a;
    public final ui f22936b;
    public final TLRPC.StickerSet f22937c;

    public hh(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f22935a = i7;
        this.f22936b = uiVar;
        this.f22937c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f22935a;
        ArrayList arrayList = (ArrayList) obj;
        ui uiVar = this.f22936b;
        uiVar.getClass();
        switch (i7) {
            case 0:
                uiVar.f1(this.f22937c.f26980id, false);
                return;
            default:
                uiVar.g1(this.f22937c.f26980id, false);
                return;
        }
    }
}
