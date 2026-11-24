package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx3 extends yo {
    public final qx3 c;

    public dx3(qx3 qx3Var) {
        this.c = qx3Var;
    }

    @Override
    public final int i(int i) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        qx3 qx3Var = this.c;
        r35 r35Var = qx3Var.x1;
        bx3 bx3Var = qx3Var.o1;
        hw hwVar = qx3Var.q1;
        if (hwVar.getAdapter() != null && hwVar.getAdapter().d(i) == 1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var.c;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i2].size();
                if (bx3Var.c.length > 1) {
                    size = Math.min(r35Var.J << 1, size);
                }
                i3 += size + 2;
                if (i < i3) {
                    break;
                }
                i2++;
            }
            ArrayList arrayList = bx3Var.b;
            if (arrayList != null && i2 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) bx3Var.b.get(i2);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return r35Var.J;
    }
}
