package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hh implements c20 {
    public final int f22928a;
    public final ui f22929b;
    public final TLRPC.StickerSet f22930c;

    public hh(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f22928a = i7;
        this.f22929b = uiVar;
        this.f22930c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f22928a;
        ArrayList arrayList = (ArrayList) obj;
        ui uiVar = this.f22929b;
        uiVar.getClass();
        switch (i7) {
            case 0:
                uiVar.f1(this.f22930c.f26979id, false);
                return;
            default:
                uiVar.g1(this.f22930c.f26979id, false);
                return;
        }
    }
}
