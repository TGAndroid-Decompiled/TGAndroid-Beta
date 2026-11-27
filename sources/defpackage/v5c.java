package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v5c extends v79 {
    public final d6c a;

    public v5c(d6c d6cVar) {
        this.a = d6cVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        v79 v79Var = this.a.E;
        if (v79Var != null) {
            v79Var.a(recyclerView, i);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        d6c d6cVar = this.a;
        c6c c6cVar = d6cVar.s;
        s5c s5cVar = d6cVar.n;
        v79 v79Var = d6cVar.E;
        if (v79Var != null) {
            v79Var.b(s5cVar, i, i2);
        }
        if (i2 > 0 && s5cVar.getAdapter() == c6cVar && d6cVar.K && !c6cVar.r && !c6cVar.s) {
            if (d6cVar.r.M0() >= ((c6cVar.x + 1) - ((c6cVar.w + 1) * 10)) - 1) {
                d6c d6cVar2 = c6cVar.y;
                if (d6cVar2.K && !c6cVar.r && !c6cVar.s) {
                    c6cVar.r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c6cVar.n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d6cVar2.a).sendRequest(tL_messages_getOldFeaturedStickers, new yp9(c6cVar, (byte) 18));
                }
            }
        }
    }
}
