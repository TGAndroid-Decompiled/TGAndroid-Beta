package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.xi;
public final class e implements el, gj {
    public final r f12305a;
    public final xi f12306b;

    public e(r rVar, xi xiVar) {
        this.f12305a = rVar;
        this.f12306b = xiVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.f12305a;
        rVar.getClass();
        xi xiVar = this.f12306b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20270w = 600;
            pageblockmap.h = 400;
            rVar.f12603r.S1(pageblockmap);
            rVar.T(true);
            xiVar.dismiss(true);
            return;
        }
        xiVar.dismiss(true);
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f12305a.f12603r.c2((MessageObject) arrayList.get(0));
        }
        this.f12306b.dismiss(true);
    }
}
