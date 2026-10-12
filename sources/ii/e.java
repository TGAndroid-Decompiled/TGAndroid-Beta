package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.ul;
public final class e implements ul, jj {
    public final r f12352a;
    public final aj f12353b;

    public e(r rVar, aj ajVar) {
        this.f12352a = rVar;
        this.f12353b = ajVar;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.f12352a;
        rVar.getClass();
        aj ajVar = this.f12353b;
        if (messageMedia != null && messageMedia.geo != null) {
            TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            pageblockmap.f20027w = 600;
            pageblockmap.h = 400;
            rVar.f12645r.S1(pageblockmap);
            rVar.Y(true);
            ajVar.dismiss(true);
            return;
        }
        ajVar.dismiss(true);
    }

    @Override
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.f12352a.f12645r.c2((MessageObject) arrayList.get(0));
        }
        this.f12353b.dismiss(true);
    }
}
