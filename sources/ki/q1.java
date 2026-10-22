package ki;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ti;
public final class q1 implements ml, cj {
    public final d2 f15454a;
    public final ti f15455b;

    public q1(d2 d2Var, ti tiVar) {
        this.f15454a = d2Var;
        this.f15455b = tiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        d2 d2Var = this.f15454a;
        d2Var.getClass();
        ti tiVar = this.f15455b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20499w = 600;
            pageblockmap.h = 400;
            d2Var.P.S1(pageblockmap);
            tiVar.dismiss(true);
            return;
        }
        tiVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f15454a.P.c2((MessageObject) arrayList.get(0));
        }
        this.f15455b.dismiss(true);
    }
}
