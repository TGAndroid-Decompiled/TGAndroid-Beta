package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.xi;
public final class s1 implements el, gj {
    public final e2 f12623a;
    public final xi f12624b;

    public s1(e2 e2Var, xi xiVar) {
        this.f12623a = e2Var;
        this.f12624b = xiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        e2 e2Var = this.f12623a;
        e2Var.getClass();
        xi xiVar = this.f12624b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20260w = 600;
            pageblockmap.h = 400;
            e2Var.P.T1(pageblockmap);
            xiVar.dismiss(true);
            return;
        }
        xiVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f12623a.P.d2((MessageObject) arrayList.get(0));
        }
        this.f12624b.dismiss(true);
    }
}
