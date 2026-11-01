package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gh implements r20 {
    public final int f15906a;
    public final vi f15907b;
    public final TLRPC.StickerSet f15908c;

    public gh(vi viVar, TLRPC.StickerSet stickerSet, int i10) {
        this.f15906a = i10;
        this.f15907b = viVar;
        this.f15908c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f15906a;
        ArrayList arrayList = (ArrayList) obj;
        vi viVar = this.f15907b;
        viVar.getClass();
        switch (i10) {
            case 0:
                viVar.f1(this.f15908c.f19821id, false);
                return;
            default:
                viVar.g1(this.f15908c.f19821id, false);
                return;
        }
    }
}
