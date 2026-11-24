package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s19 implements f59 {
    public final byte a;
    public final Object b;

    public s19(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        Boolean bool;
        oyb oybVar = (oyb) this.b;
        ArrayList arrayList = oybVar.U;
        if (i >= 0 && i < arrayList.size()) {
            lyb lybVar = (lyb) arrayList.get(i);
            long j = lybVar.a;
            if (j != 0) {
                if (oybVar.V == j) {
                    j = 0;
                }
                oybVar.V = j;
            } else {
                if (lybVar.b.equals(oybVar.W)) {
                    bool = null;
                } else {
                    bool = lybVar.b;
                }
                oybVar.W = bool;
            }
            gm.d0(oybVar.S, new byb((byte) 0));
            oybVar.l(false);
            oybVar.n();
        }
    }

    private final void b(int i, View view) {
        TLRPC.StickerSetCovered stickerSetCovered;
        d4c d4cVar = (d4c) this.b;
        y59 adapter = d4cVar.n.getAdapter();
        e3b e3bVar = d4cVar.w;
        if (adapter == e3bVar) {
            stickerSetCovered = (TLRPC.StickerSetCovered) e3bVar.L.get(i);
        } else {
            c4c c4cVar = d4cVar.s;
            if (i < c4cVar.x) {
                stickerSetCovered = (TLRPC.StickerSetCovered) c4cVar.f.get(i);
            } else {
                stickerSetCovered = null;
            }
        }
        if (stickerSetCovered != null) {
            d4cVar.b(stickerSetCovered.set, null);
        }
    }

    @Override
    public final void g(int r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s19.g(int, android.view.View):void");
    }
}
