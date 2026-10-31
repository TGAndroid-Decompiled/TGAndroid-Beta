package bi;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.wk;
public final class g implements wk, ji {
    public final t f3021a;
    public final bi f3022b;

    public g(t tVar, bi biVar) {
        this.f3021a = tVar;
        this.f3022b = biVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        t tVar = this.f3021a;
        tVar.getClass();
        bi biVar = this.f3022b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20017w = 600;
            pageblockmap.h = 400;
            tVar.f3350r.U1(pageblockmap);
            tVar.Y(true);
            biVar.a(true);
            return;
        }
        biVar.a(true);
    }

    @Override
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f3021a.f3350r.e2((jj) arrayList.get(0));
        }
        this.f3022b.a(true);
    }
}
