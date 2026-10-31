package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fh implements q20 {
    public final int f15565a;
    public final ui f15566b;
    public final TLRPC.StickerSet f15567c;

    public fh(ui uiVar, TLRPC.StickerSet stickerSet, int i10) {
        this.f15565a = i10;
        this.f15566b = uiVar;
        this.f15567c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f15565a;
        ArrayList arrayList = (ArrayList) obj;
        ui uiVar = this.f15566b;
        uiVar.getClass();
        switch (i10) {
            case 0:
                uiVar.f1(this.f15567c.f19820id, false);
                return;
            default:
                uiVar.g1(this.f15567c.f19820id, false);
                return;
        }
    }
}
