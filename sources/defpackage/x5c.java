package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x5c implements q4b {
    public final TLRPC.InputStickerSet a;
    public final d6c b;

    public x5c(d6c d6cVar, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d6cVar;
        this.a = inputStickerSet;
    }

    @Override
    public final void a() {
        d6c d6cVar = this.b;
        j79 adapter = d6cVar.n.getAdapter();
        c6c c6cVar = d6cVar.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i = 0;
        if (adapter == c6cVar) {
            while (i < c6cVar.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c6cVar.e.get(i);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c6cVar.F(stickerSetCovered, null);
                    return;
                }
                i++;
            }
            return;
        }
        z4b z4bVar = d6cVar.w;
        ArrayList arrayList = z4bVar.F;
        while (i < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                z4bVar.F(stickerSetCovered2, null);
                return;
            }
            i++;
        }
    }
}
