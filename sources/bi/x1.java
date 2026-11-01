package bi;

import java.util.ArrayList;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.wk;
public final class x1 implements wk, ji {
    public final k2 f3445a;
    public final bi f3446b;

    public x1(k2 k2Var, bi biVar) {
        this.f3445a = k2Var;
        this.f3446b = biVar;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        k2 k2Var = this.f3445a;
        k2Var.getClass();
        bi biVar = this.f3446b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20018w = 600;
            pageblockmap.h = 400;
            k2Var.P.U1(pageblockmap);
            biVar.a(true);
            return;
        }
        biVar.a(true);
    }

    @Override
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.f3445a.P.e2((kj) arrayList.get(0));
        }
        this.f3446b.a(true);
    }
}
