package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zx3 extends zo {
    public final ly3 c;

    public zx3(ly3 ly3Var) {
        this.c = ly3Var;
    }

    @Override
    public final int i(int i) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ly3 ly3Var = this.c;
        u55 u55Var = ly3Var.x1;
        xx3 xx3Var = ly3Var.o1;
        iw iwVar = ly3Var.q1;
        if (iwVar.getAdapter() != null && iwVar.getAdapter().d(i) == 1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var.c;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i2].size();
                if (xx3Var.c.length > 1) {
                    size = Math.min(u55Var.J << 1, size);
                }
                i3 += size + 2;
                if (i < i3) {
                    break;
                }
                i2++;
            }
            ArrayList arrayList = xx3Var.b;
            if (arrayList != null && i2 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) xx3Var.b.get(i2);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return u55Var.J;
    }
}
