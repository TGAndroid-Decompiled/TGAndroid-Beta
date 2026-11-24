package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oy3 extends yp {
    public final az3 c;

    public oy3(az3 az3Var) {
        this.c = az3Var;
    }

    @Override
    public final int i(int i) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        az3 az3Var = this.c;
        q55 q55Var = az3Var.x1;
        my3 my3Var = az3Var.o1;
        hx hxVar = az3Var.q1;
        if (hxVar.getAdapter() != null && hxVar.getAdapter().d(i) == 1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var.c;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i2].size();
                if (my3Var.c.length > 1) {
                    size = Math.min(q55Var.J << 1, size);
                }
                i3 += size + 2;
                if (i < i3) {
                    break;
                }
                i2++;
            }
            ArrayList arrayList = my3Var.b;
            if (arrayList != null && i2 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) my3Var.b.get(i2);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return q55Var.J;
    }
}
