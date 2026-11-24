package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w3c extends k69 {
    public final d4c a;

    public w3c(d4c d4cVar) {
        this.a = d4cVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        k69 k69Var = this.a.E;
        if (k69Var != null) {
            k69Var.a(recyclerView, i);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        d4c d4cVar = this.a;
        c4c c4cVar = d4cVar.s;
        t3c t3cVar = d4cVar.n;
        k69 k69Var = d4cVar.E;
        if (k69Var != null) {
            k69Var.b(t3cVar, i, i2);
        }
        if (i2 > 0 && t3cVar.getAdapter() == c4cVar && d4cVar.K && !c4cVar.r && !c4cVar.s) {
            if (d4cVar.r.M0() >= ((c4cVar.x + 1) - ((c4cVar.w + 1) * 10)) - 1) {
                d4c d4cVar2 = c4cVar.y;
                if (d4cVar2.K && !c4cVar.r && !c4cVar.s) {
                    c4cVar.r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c4cVar.n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d4cVar2.a).sendRequest(tL_messages_getOldFeaturedStickers, new go9(c4cVar, (byte) 18));
                }
            }
        }
    }
}
