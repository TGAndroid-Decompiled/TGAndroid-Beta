package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w1c extends i49 {
    public final d2c a;

    public w1c(d2c d2cVar) {
        this.a = d2cVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        i49 i49Var = this.a.E;
        if (i49Var != null) {
            i49Var.a(recyclerView, i);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        d2c d2cVar = this.a;
        c2c c2cVar = d2cVar.s;
        t1c t1cVar = d2cVar.n;
        i49 i49Var = d2cVar.E;
        if (i49Var != null) {
            i49Var.b(t1cVar, i, i2);
        }
        if (i2 > 0 && t1cVar.getAdapter() == c2cVar && d2cVar.K && !c2cVar.r && !c2cVar.s) {
            if (d2cVar.r.M0() >= ((c2cVar.x + 1) - ((c2cVar.w + 1) * 10)) - 1) {
                d2c d2cVar2 = c2cVar.y;
                if (d2cVar2.K && !c2cVar.r && !c2cVar.s) {
                    c2cVar.r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c2cVar.n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d2cVar2.a).sendRequest(tL_messages_getOldFeaturedStickers, new wx9(c2cVar, (byte) 17));
                }
            }
        }
    }
}
