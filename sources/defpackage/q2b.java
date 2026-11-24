package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class q2b extends gu5 {
    public int f;
    public final x2b g;

    public q2b(x2b x2bVar) {
        this.g = x2bVar;
        this.e = (byte) 15;
        this.f = -1;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        int i = u69Var.f;
        if (i != 3 && i == u69Var2.f) {
            x2b x2bVar = this.g;
            if (x2bVar.M1 == null) {
                return false;
            }
            int b = u69Var.b();
            int b2 = u69Var2.b();
            x2bVar.M1.documents.add(b2, x2bVar.M1.documents.remove(b));
            x2bVar.n1.j(b, b2);
            this.f = b2;
            return true;
        }
        return false;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        x2b x2bVar = this.g;
        if (i == 0 && x2bVar.p1 != null && this.f > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f;
            tL_stickers_changeStickerPosition.sticker = hs6.c0(x2bVar.p1, "").document;
            this.f = -1;
            x2bVar.p1 = null;
        } else if (i == 2) {
            x2bVar.p1 = ((y0b) u69Var.a).getSticker();
        }
    }

    @Override
    public final void r(u69 u69Var) {
    }

    @Override
    public final void p(RecyclerView recyclerView, u69 u69Var, u69 u69Var2, int i, int i2, int i3) {
    }
}
