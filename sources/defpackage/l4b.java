package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class l4b extends ku5 {
    public int f;
    public final s4b g;

    public l4b(s4b s4bVar) {
        this.g = s4bVar;
        this.e = (byte) 15;
        this.f = -1;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        int i = f89Var.f;
        if (i != 3 && i == f89Var2.f) {
            s4b s4bVar = this.g;
            if (s4bVar.M1 == null) {
                return false;
            }
            int b = f89Var.b();
            int b2 = f89Var2.b();
            s4bVar.M1.documents.add(b2, s4bVar.M1.documents.remove(b));
            s4bVar.n1.j(b, b2);
            this.f = b2;
            return true;
        }
        return false;
    }

    @Override
    public final void q(f89 f89Var, int i) {
        s4b s4bVar = this.g;
        if (i == 0 && s4bVar.p1 != null && this.f > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f;
            tL_stickers_changeStickerPosition.sticker = ls6.c0(s4bVar.p1, "").document;
            this.f = -1;
            s4bVar.p1 = null;
        } else if (i == 2) {
            s4bVar.p1 = ((x2b) f89Var.a).getSticker();
        }
    }

    @Override
    public final void r(f89 f89Var) {
    }

    @Override
    public final void p(RecyclerView recyclerView, f89 f89Var, f89 f89Var2, int i, int i2, int i3) {
    }
}
